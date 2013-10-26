package com.acme.javaee.multiple_contexts;

import javax.ejb.EJB;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class Context3Listener implements ServletContextListener
{
  @EJB
  private Context3Ejb greeter;

  @Override
  public void contextDestroyed(final ServletContextEvent sce)
  {
    greeter.goodbye(getClass().getName());
  }

  @Override
  public void contextInitialized(final ServletContextEvent sce)
  {
    greeter.hello(getClass().getName());
  }
}
