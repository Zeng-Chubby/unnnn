## 本项目由 Spring Mvc 构建

### linux 常用命令
### linux JDK 配置
### tomcat 全自动部署
1. tomcat 用户配置

    配置用户发布的时候需要用到。

    ```xml
    <role rolename="admin-gui"/>
    <role rolename="admin-script"/>
    <role rolename="manager-gui"/>
    <role rolename="manager-script"/>
    <role rolename="manager-jmx"/>
    <role rolename="manager-status"/>
    <user username="admin" password="123456" roles="manager-gui"/>
    <user username="root" password="123456" roles="manager-gui,manager-script"  />
    ```
2. tomcat 访问权限配置

要是需要远程访问出现403者需要修改webapps下的host-manager和manager目录下面的META-INF文件中的context.xml。
这段代码的作用是限制来访IP的，127.d+.d+.d+|::1|0:0:0:0:0:0:0:1通过正则表达式匹配。
``` xml
<Context antiResourceLocking="false" privileged="true" >
  <Valve className="org.apache.catalina.valves.RemoteAddrValve"
         allow="127.d+.d+.d+|::1|0:0:0:0:0:0:0:1" />
</Context>
```
修改 allow 或者注释也行。
``` xml
<Context antiResourceLocking="false" privileged="true" >
  <Valve className="org.apache.catalina.valves.RemoteAddrValve"
         allow="^.*$" />
</Context>
```

3. maven 配置 tomcat 插件
4. 
> `mvn clean package -Dmaven.test.skip=true -Ptest tomcat7:redeploy`