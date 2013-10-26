package com.acme.javaee.multiple_contexts;

import java.util.logging.Logger;

import javax.ejb.Stateless;

@Stateless
public class Context1Ejb
{
  private static final Logger LOG = Logger
                                      .getLogger(Context1Ejb.class.getName());

  public void goodbye(final String name)
  {
    LOG.info("\n\n\n");
    LOG.info("<<<<< Goodbye " + name);
    LOG.info("\n\n\n");
  }

  public void hello(final String name)
  {
    LOG.info("\n\n\n");
    LOG.info(">>>>> Hello " + name);
    LOG.info("\n\n\n");
  }
}
