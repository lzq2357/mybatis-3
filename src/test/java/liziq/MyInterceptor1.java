package liziq;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;

import java.sql.Connection;
import java.util.Properties;



/**
 * 注解：
 * Intercepts：指定要拦截哪个对象的哪个方法，多个 Signature 就是拦截多个对象
 * Signature：具体哪个对象、哪个方法
 *
 * */
@Intercepts({
        @Signature(type = StatementHandler.class, method = "prepare", args = { Connection.class, Integer.class})
})
public class MyInterceptor1 implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        //拦截到的 目标类 statementHandler，通过它获取到 执行的sql
        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        Object parameterObject = statementHandler.getParameterHandler().getParameterObject();
        String sql = statementHandler.getBoundSql().getSql();
        String msg = String.format("正在执行的sql : %s。 参数：%s" ,sql, parameterObject);
        System.out.println(msg);
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
        String dialect = properties.getProperty("dialect");
        System.out.println("mybatis intercept dialect:"+dialect);
    }
}
