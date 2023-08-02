package com.gap.sample.practice.Springboot_practice.controller;

import com.gap.sample.practice.Springboot_practice.advice.logging.LogSlowExecution;
import com.gap.sample.practice.Springboot_practice.configuration.ReadDataFromYAMLFile;
import com.gap.sample.practice.Springboot_practice.dependency.injection.MyService;
import com.gap.sample.practice.Springboot_practice.dependency.injection.UserServiceImpl;
import com.gap.sample.practice.Springboot_practice.entity.Employee;
import com.gap.sample.practice.Springboot_practice.exception.NoEmployeesFoundInDatabase;
import com.gap.sample.practice.Springboot_practice.service.EmployeeService;
import com.gap.sample.practice.custome.annotations.Hello;
import com.gap.sample.practice.custome.annotations.User;
import com.mongodb.client.MongoClient;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.mongo.MongoClientFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validator;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;

@RestController
@RequestMapping("/employee")
@Validated
public class EmployeeController {

    //public  static final String  = "Print";

//    @Value("${hello.hello}")
    public  String jasypt;

    @Autowired
    EmployeeService employeeService;

    @Autowired
    private ApplicationContext applicationContext;


    @Autowired
    UserServiceImpl myService;
    @Autowired
    UserServiceImpl myService2;

    @Autowired
    ReadDataFromYAMLFile readDataFromYAMLFile;

    @Autowired
    private Environment env;

    @Autowired
    Validator validator;

    private final MongoTemplate mongoTemplate;

    @Autowired
    public EmployeeController(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }


    @GetMapping("/getAllEmployees/getEmployees/{pathParam1}/rakesh/{pathParam2}")
    public ResponseEntity<List<Employee>> getAllTheEmployees(@PathVariable("pathParam1") String id,
                                                             @PathVariable("pathParam2") String id2) {

        System.out.println(myService.hashCode());
        System.out.println(myService2.hashCode());

        System.out.println("Path param");
        // System.out.println("Jasypt is  => " + jasypt);
//        mongoTemplate.getDb().createCollection("helloWorld");


//        System.out.println(applicationContext);
        listAllBeans();
        System.out.println(env.getProperty("sizeLocalisationConfig.sizeRange.retry.maxAttempts"));
       // myService.seeAllInjections();
        System.out.println(readDataFromYAMLFile.getList());
        return employeeService.getAllEmployees();

    }
    public void listAllBeans() {
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

    @PostMapping("/saveEmployee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody @Valid Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/getEmployeeById/{id}")
    @LogSlowExecution
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") String id) {
        return employeeService.findById(id);
    }

    public static void main(String[] args) {

        System.out.println(LocalDate.parse("2022-08-08").plusWeeks(1));
        System.out.println(Locale.US.getCountry());


//        List<String> list = new ArrayList<>(null);
//
//        System.out.println(list);


    }


    public static void throwErrror(@NotNull String value) {

//        System.out.println("Print I have ");
//        System.out.println(value);


    }

    public static void givenUsingPlainJava_whenGeneratingRandomStringUnbounded_thenCorrect() {
        byte[] array = new byte[7];
        new Random().nextBytes(array);
        String generatedString = new String(array, StandardCharsets.UTF_8);

        System.out.println(generatedString);

        System.out.println("PerformanceJobPlaceHolderCreation-" + System.currentTimeMillis());


        String ss = "\"PerformanceJobPlaceHolderCreation" + System.currentTimeMillis() + "\"";
        System.out.println("data => " + ss);
    }

    @GetMapping("/getEmployeeById/throwError")
    public ResponseEntity<Employee> throwError() throws Exception {

        throw new NoEmployeesFoundInDatabase("Employee details not found");
    }


    @GetMapping("redirect/url")
    ResponseEntity<Void> redirect() {
        return ResponseEntity.status(HttpStatus.FOUND)
                .location(URI.create("http://www.youtube.com"))
                .build();

    }

    @GetMapping("redirect/url/rakesh")
    public RedirectView redirectWithUsingRedirectView(RedirectAttributes attributes,
                                                      HttpServletRequest request) {
        //request.getRequestURI()
        attributes.addFlashAttribute("message", "Welcome to the Redirected Page!");
        return new RedirectView("www.youtube.com");
    }

    @GetMapping("redirect/url/rakeshy")
    @LogSlowExecution()
    public String usingResponseEntity(HttpServletResponse response) {

        // attributes.addFlashAttribute("message", "Welcome to the Redirected Page!");
        //return new RedirectView("www.youtube.com");
        try {
            response.sendRedirect("https://www.youtube.coms");
            //System.out.println(Unit);
        } catch (IOException exception) {
            System.out.println("URL not found");
        }
        return "Print";
    }


    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody @Valid User user) {

        Set<ConstraintViolation<User>> set = validator.validate(user, Hello.class);
        System.out.println(set);

        System.out.println("HEllo I don't get call");
        //checkString("Rakesh","Raje");
        return null;
    }






}
