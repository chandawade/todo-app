# todo-app
#Build 
**Checkout Source**

git clone https://github.com/chandawade/todo-app.git
git checkout <target_branch>

#Build Runnable Artifact Locally
mvn clean package -Dspring.profiles.active=dev

#Run Application
**General Command**

java -jar -Dspring.profiles.active=dev target/toDoApp-1.0-SNAPSHOT.war

**Start-up output:**

2019-01-04 08:29:20.386  INFO 19283 --- [           main] c.ubiqcoding.core.todo.ToDoApplication   : Starting ToDoApplication v1.0-SNAPSHOT on CNCL02WJ24SG8WL with PID 19283 (/Users/cn163848/app-project/toDoApp/target/toDoApp-1.0-SNAPSHOT.war started by cn163848 in /Users/cn163848/app-project/toDoApp)
2019-01-04 08:29:20.390  INFO 19283 --- [           main] c.ubiqcoding.core.todo.ToDoApplication   : The following profiles are active: dev
2019-01-04 08:29:21.613  INFO 19283 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2019-01-04 08:29:21.649  INFO 19283 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2019-01-04 08:29:21.650  INFO 19283 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/9.0.13
2019-01-04 08:29:21.662  INFO 19283 --- [           main] o.a.catalina.core.AprLifecycleListener   : The APR based Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: [/Users/cn163848/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.]
2019-01-04 08:29:22.335  INFO 19283 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2019-01-04 08:29:22.335  INFO 19283 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1860 ms
2019-01-04 08:29:22.566  INFO 19283 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2019-01-04 08:29:22.781  INFO 19283 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2019-01-04 08:29:22.787  INFO 19283 --- [           main] c.ubiqcoding.core.todo.ToDoApplication   : Started ToDoApplication in 2.886 seconds (JVM running for 3.425)

