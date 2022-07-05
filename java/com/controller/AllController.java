package com.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.dao.*;
import com.entity.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.entity.*;

import java.util.*;



@RestController
@RequestMapping(value= "/sakai")
public class AllController {

    @Autowired
    private UserDAO userdao;

    @Autowired
    private UserMapDAO usermapdao;

    @Autowired
    private TasksDAO tasksdao;

    @Autowired
    private Calendar_calendarDAO cdao;

    @Autowired
    private Citation_schema_fieldDAO cidao;

    @Autowired
    private Citation_schemaDAO cidao2;

    @Autowired
    private Email_template_itemDAO edao;

    @Autowired
    private Scheduler_trigger_eventsDAO evendao;

    @Autowired
    private Sakai_aliasDAO adao;

    @Autowired
    private Sakai_siteDAO sitedao;

    //*===============================1.用户=========================================

    @GetMapping(path = "/User")
    public List<Sakai_user> getStudents() {
        List<Sakai_user>  userList = userdao.getuser();
        return userList;
    }

    @GetMapping(path = "/User/{uid}")
    public  List<Sakai_user> getStudentById(@PathVariable String uid){
        return userdao.getuserByid(uid);
    }

    @PostMapping(path = "/User")
    public void SaveUser(@RequestBody Sakai_user user,Sakai_user_id_map MAP,@PathVariable String eid) {
        userdao.save(user);
        MAP.setEID(eid);
        MAP.setUSER_ID(user.getUSER_ID());
        usermapdao.save(MAP);

    }

    @DeleteMapping(path = "/User/{uid}")
    public void DeleteUser(@PathVariable String uid) {

        userdao.deleteAllById(Collections.singleton(uid));

        usermapdao.deleteAllById(Collections.singleton(uid));


    }

    @PutMapping(path = "/User")
    public void UpdateUser(@PathVariable String uid,HttpServletRequest request,@RequestParam(value = "EMAIL",required = false) String EMAIL,@RequestParam(value = "FN",required = false) String FN,
                           @RequestParam(value = "LN",required = false) String LN,@RequestParam(value = "TYPE",required = false) String TYPE,@RequestParam(value = "PW",required = false) String PW,
                           @RequestParam(value = "EID",required = false) String EID) {


        EMAIL=request.getParameter("EMAIL");
        FN=request.getParameter("FN");
        LN=request.getParameter("LN");
        TYPE=request.getParameter("TYPE");
        PW=request.getParameter("PW");
        EID=request.getParameter("EID");
        Optional<Sakai_user> optional = userdao.findById(uid);
        Sakai_user user= optional.get();
        Optional<Sakai_user_id_map> optional2 = usermapdao.findById(uid);
        Sakai_user_id_map map = optional2.get();


        if (EMAIL!=null){
            user.setEMAIL(EMAIL);
        }

        if (FN!=null){
            user.setFIRST_NAME(FN);

        }

        if (LN!=null){

            user.setLAST_NAME(LN);
        }

        if (TYPE!=null){
            user.setTYPE(TYPE);

        }

        if (PW!=null){
            user.setPW(PW);
        }

        if (EID!=null){
            map.setEID(EID);

        }
        userdao.save(user);
        usermapdao.save(map);

    }

//===============================2.任务=========================================

    @GetMapping(path = "/Tasks")
    public List<Tasks> getTasks() {
        List<Tasks> TasksList = tasksdao.findAll();
        return TasksList;
    }

    @PostMapping(path = "/AddTask/{ID}")
    public void addTask(@RequestBody Tasks task , @PathVariable int ID){
//        task.setID(ID);
//        task.setDESCRIPTION("askugf");
//        task.setREFERENCE("askugf");
//        task.setSYSTEM(true);
        Date date = new Date(System.currentTimeMillis());
        task.setDUE(date);
        task.setSTARTS(date);
        tasksdao.save(task);
    }

    @DeleteMapping(path = "/DeleteTask/{ID}")
    public void Deletetask(@PathVariable int ID) {
        tasksdao.deleteAllById(Collections.singleton(ID));

    }

    @PutMapping(path = "/UpdateTask/{ID}")
    public void UpdateUser(@PathVariable int ID,HttpServletRequest request,
                           @RequestParam(value = "DESCRIPTION",required = false) String DESCRIPTION,
                           @RequestParam(value = "REFERENCE",required = false) String REFERENCE,
                           @RequestParam(value = "SITE_ID",required = false) String SITE_ID,
                           @RequestParam(value = "SYSTEM",required = false) Boolean SYSTEM){
        DESCRIPTION=request.getParameter("DESCRIPTION");
        REFERENCE=request.getParameter("REFERENCE");
        SITE_ID=request.getParameter("SITE_ID");
        Optional<Tasks> optional = tasksdao.findById(ID);
        Tasks task= optional.get();

        if (DESCRIPTION!=null){
            task.setDESCRIPTION(DESCRIPTION);
        }

        if (REFERENCE!=null){
            task.setREFERENCE(REFERENCE);

        }

        if (SITE_ID!=null){
            task.setSITE_ID(SITE_ID);
        }
        tasksdao.save(task);
    }

//===============================3.日历=========================================
    @GetMapping(path = "/Date")
    public List<Calendar_calendar> getdate() {
        List<Calendar_calendar>  dateList = cdao.findAll();
        return dateList;
    }

    @PostMapping(path = "/AddDate/{CALENDAR_ID}")
    public void addDate(@RequestBody Calendar_calendar date , @PathVariable String CALENDAR_ID){
//        task.setID(ID);
//        task.setDESCRIPTION("askugf");
//        task.setREFERENCE("askugf");
//        task.setSYSTEM(true);
        cdao.save(date);
    }

    @DeleteMapping(path = "/DeleteDate/{CALENDAR_ID}")
    public void DeleteDate(@PathVariable String CALENDAR_ID) {
        cdao.deleteAllById(Collections.singleton(CALENDAR_ID));

    }

    @PutMapping(path = "/UpdateDate/{CALENDAR_ID}")
    public void UpdateDate(@PathVariable String CALENDAR_ID,HttpServletRequest request,
                           @RequestParam(value = "XML",required = false) String XML){
        XML=request.getParameter("XML");
        Optional<Calendar_calendar> optional = cdao.findById(CALENDAR_ID);
        Calendar_calendar date= optional.get();

        if (XML!=null){
            date.setXML(XML);
        }

        cdao.save(date);
    }

    //===============================4.引文模式字段=========================================
    @GetMapping(path = "/Sch")
    public List<Citation_schema_field> getSch() {
        List<Citation_schema_field>  schList = cidao.findAll();
        return schList;
    }

    @PostMapping(path = "/AddSch/{SCHEMA_ID}")
    public void addSch(@RequestBody Citation_schema_field sch , Citation_schema sch2, @PathVariable String SCHEMA_ID){
//        task.setID(ID);
//        task.setDESCRIPTION("askugf");
//        task.setREFERENCE("askugf");
//        task.setSYSTEM(true);
        cidao.save(sch);
        sch2.setPROPERTY_NAME(sch.getPROPERTY_NAME());
        sch2.setPROPERTY_VALUE(sch.getPROPERTY_VALUE());
        sch2.setSCHEMA_ID(SCHEMA_ID);
        cidao2.save(sch2);

    }

    @DeleteMapping(path = "/DeleteSch/{SCHEMA_ID}")
    public void DeleteSch(@PathVariable String SCHEMA_ID) {
        cidao.deleteAllById(Collections.singleton(SCHEMA_ID));
        cidao2.deleteAllById(Collections.singleton(SCHEMA_ID));
    }

    @PutMapping(path = "/UpdateSch/{SCHEMA_ID}")
    public void UpdateSch(@PathVariable String SCHEMA_ID,HttpServletRequest request,
                           @RequestParam(value = "FIELD_ID",required = false) String FIELD_ID,
                          @RequestParam(value = "PROPERTY_NAME",required = false) String PROPERTY_NAME,
                          @RequestParam(value = "PROPERTY_VALUE",required = false) String PROPERTY_VALUE){
        FIELD_ID=request.getParameter("FIELD_ID");
        PROPERTY_NAME=request.getParameter("PROPERTY_NAME");
        PROPERTY_VALUE=request.getParameter("PROPERTY_VALUE");
        Optional<Citation_schema_field> optional = cidao.findById(SCHEMA_ID);
        Citation_schema_field sch= optional.get();
        Optional<Citation_schema> optional2 = cidao2.findById(SCHEMA_ID);
        Citation_schema sch2= optional2.get();

        if (FIELD_ID!=null){
            sch.setFIELD_ID(FIELD_ID);
        }
        if (PROPERTY_NAME!=null){
            sch.setPROPERTY_NAME(PROPERTY_NAME);
        }
        if (PROPERTY_VALUE!=null){
            sch.setPROPERTY_VALUE(PROPERTY_VALUE);
        }

        cidao.save(sch);
        cidao2.save(sch2);
    }

    //*===============================5.电子邮件模板项=========================================

    @GetMapping(path = "/Email")
    public List<Email_template_item> getE() {
        List<Email_template_item>  eList = edao.findAll();
        return eList;
    }

    @PostMapping(path = "/Email")
    public void addE(@RequestBody Email_template_item e ,@PathVariable int ID){
//        task.setID(ID);
//        task.setDESCRIPTION("askugf");
//        task.setREFERENCE("askugf");
//        task.setSYSTEM(true);
        edao.save(e);
    }

    @DeleteMapping(path = "/Email/{ID}")
    public void DeleteE(@PathVariable int ID) {
        edao.deleteAllById(Collections.singleton(ID));
    }

    @GetMapping(path = "/Email/{ID}")
    public  List<Email_template_item> getById(@PathVariable int ID){

        return edao.getByid(ID);
    }

    @PutMapping(path = "/Email")
    public void UpdateE(@PathVariable int ID,HttpServletRequest request,
                          @RequestParam(value = "OWNER",required = false) String OWNER,
                          @RequestParam(value = "SUBJECT",required = false) String SUBJECT,
                          @RequestParam(value = "emailfrom",required = false) String emailfrom) {
        OWNER=request.getParameter("OWNER");
        SUBJECT=request.getParameter("SUBJECT");
        emailfrom=request.getParameter("emailfrom");
        Optional<Email_template_item> optional = edao.findById(ID);
        Email_template_item sch= optional.get();

        if (OWNER!=null){
            sch.setOWNER(OWNER);
        }
        if (SUBJECT!=null){
            sch.setSUBJECT(SUBJECT);
        }
        if (emailfrom!=null){
            sch.setEmailfrom(emailfrom);
        }
        edao.save(sch);
    }

    //*===============================6.事件=========================================

    @GetMapping(path = "/Even")
    public List<Scheduler_trigger_events> getEe() {
        List<Scheduler_trigger_events>  eList = evendao.findAll();
        return eList;
    }

    @PostMapping(path = "/Even")
    public void addE(@RequestBody Scheduler_trigger_events e ,@PathVariable String uuid){
//        task.setID(ID);
//        task.setDESCRIPTION("askugf");
//        task.setREFERENCE("askugf");
//        task.setSYSTEM(true);
        Date date = new Date(System.currentTimeMillis());
        e.setEventTime(date);
        evendao.save(e);
    }

    @DeleteMapping(path = "/Even/{uuid}")
    public void DeleteE(@PathVariable String uuid) {
        evendao.deleteAllById(Collections.singleton(uuid));

    }

    @GetMapping(path = "/Even/{uuid}")
    public  List<Scheduler_trigger_events> getById(@PathVariable String uuid){

        return evendao.getByid(uuid);
    }

    @PutMapping(path = "/Even")
    public void UpdateE(@PathVariable String uuid,HttpServletRequest request,
                        @RequestParam(value = "eventType",required = false) String eventType,
                        @RequestParam(value = "jobName",required = false) String jobName,
                        @RequestParam(value = "message",required = false) String message) {
        eventType=request.getParameter("eventType");
        jobName=request.getParameter("jobName");
        message=request.getParameter("message");
        Optional<Scheduler_trigger_events> optional = evendao.findById(uuid);
        Scheduler_trigger_events sch= optional.get();

        if (eventType!=null){
            sch.setEventType(eventType);
        }
        if (jobName!=null){
            sch.setJobName(jobName);
        }
        if (message!=null){
            sch.setMessage(message);
        }
        evendao.save(sch);
    }

    //*===============================7.别名=========================================

    @GetMapping(path = "/Alias")
    public List<Sakai_alias> geta() {
        List<Sakai_alias>  eList = adao.findAll();
        return eList;
    }

    @GetMapping(path = "/Alias/{ALIAS_ID}")
    public  List<Sakai_alias> getById2(@PathVariable String ALIAS_ID){
        return adao.getByid(ALIAS_ID);
    }

    @PostMapping(path = "/Alias")
    public void addE(@RequestBody Sakai_alias e ,@PathVariable String ALIAS_ID){
//        task.setID(ID);
//        task.setDESCRIPTION("askugf");
//        task.setREFERENCE("askugf");
//        task.setSYSTEM(true);
        Date date = new Date(System.currentTimeMillis());
        e.setCREATEDON(date);
        adao.save(e);
    }

    @DeleteMapping(path = "/Alias/{ALIAS_ID}")
    public void Deletea(@PathVariable String ALIAS_ID) {
        adao.deleteAllById(Collections.singleton(ALIAS_ID));

    }

    @PutMapping(path = "/Alias")
    public void UpdateE(@PathVariable String ALIAS_ID,HttpServletRequest request,
                        @RequestParam(value = "TARGET",required = false) String TARGET){
        TARGET=request.getParameter("TARGET");
        Optional<Sakai_alias> optional = adao.findById(ALIAS_ID);
        Sakai_alias sch= optional.get();

        if (TARGET!=null){
            sch.setTARGET(TARGET);
        }

        adao.save(sch);
    }

    //*===============================8.站点=========================================

    @GetMapping(path = "/Sites")
    public List<Sakai_site> getSite() {
        List<Sakai_site>  eList = sitedao.findAll();
        return eList;
    }

    @GetMapping(path = "/Sites/{SITE_ID}")
    public  List<Sakai_site> getBysiteId(@PathVariable String SITE_ID){
        return sitedao.getByid(SITE_ID);

    }

    @PostMapping(path = "/Sites")
    public void addE(@RequestBody Sakai_site e){
//        task.setID(ID);
//        task.setDESCRIPTION("askugf");
//        task.setREFERENCE("askugf");
//        task.setSYSTEM(true);
        sitedao.save(e);
    }

    @DeleteMapping(path = "/Sites/{SITE_ID}")
    public void DeletSite(@PathVariable String SITE_ID) {
        sitedao.deleteAllById(Collections.singleton(SITE_ID));
    }

    @PutMapping(path = "/Sites")
    public void UpdateSite(@RequestBody Sakai_site e){
//        task.setID(ID);
//        task.setDESCRIPTION("askugf");
//        task.setREFERENCE("askugf");
//        task.setSYSTEM(true);
        sitedao.save(e);
    }
}
