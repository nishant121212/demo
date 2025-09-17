## 📡APIs

```bash
curl --location --request GET 'http://localhost:8080/users'

curl --location --request POST 'http://localhost:8080/users' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Nishant",
    "email": "nishant@demo.com",
    "age" : 30
}'



2025-09-15T17:26:36.426+05:30 ERROR 26056 --- [demo] [nio-8080-exec-4] o.a.c.c.C.[.[.[/].[dispatcherServlet]    : Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed: java.lang.NullPointerException: Cannot invoke "String.toLowerCase()" because the return value of "com.example.demo.modelanddto.UserRequest.email()" is null] with root cause

java.lang.NullPointerException: Cannot invoke "String.toLowerCase()" because the return value of "com.example.demo.modelanddto.UserRequest.email()" is null
	at com.example.demo.service.UserService.createUser(UserService.java:26) ~[classes/:na]
	at com.example.demo.controller.UserController.createUser(UserController.java:25) ~[classes/:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:568) ~[na:na]
	at org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:258) ~[spring-web-6.2.10.jar:6.2.10]
	at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:191) ~[spring-web-6.2.10.jar:6.2.10]
	at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:118) ~[spring-webmvc-6.2.10.jar:6.2.10]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:991) ~[spring-webmvc-6.2.10.jar:6.2.10]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:896) ~[spring-webmvc-6.2.10.jar:6.2.10]
	at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87) ~[spring-webmvc-6.2.10.jar:6.2.10]
	at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1089) ~[spring-webmvc-6.2.10.jar:6.2.10]
	at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:979) ~[spring-webmvc-6.2.10.jar:6.2.10]
