//package org.luo.auth.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * 监控权限配置
// *
// * @author ruoyi
// */
//@Configuration
//public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        //authorizeRequests 所有security全注解配置实现的开端,表示开始说明需要的权限(authorize)
//        //需要的权限分两部分,第一部分是拦截的路径,第二部分访问该路径需要的权限
//        //antMatchers表示拦截什么路径,permitAll任何权限都可以访问,直接放行所有
//        //anyRequest任何的请求,authenticated认证后才能访问
//        //.and().csrf().disable();固定写法,表示使csrf(攻击技术)拦截失效
//        http.authorizeRequests()
//                .antMatchers("/**").permitAll()
//                .anyRequest().authenticated()
//                .and().httpBasic()
//                .and().csrf().disable();
//
//    }
//}
