package com.novaordis.em.ec2.model;

/**
 * @author <a href="mailto:ovidiu@novaordis.com">Ovidiu Feodorov</a>
 *
 * Copyright 2015 Nova Ordis LLC
 */
public enum InstanceState
{
    RUNNING("running"),
    PENDING("pending"),
    STOPPING("stopping"),
    STOPPED("stopped"),
    SHUTTING_DOWN("shutting-down"),
    TERMINATED("terminated");

    private String literal;

    InstanceState(String literal)
    {
        this.literal = literal;
    }

    public static InstanceState toInstanceState(String literal)
    {
        if (literal == null)
        {
            throw new IllegalArgumentException("null literal");
        }

        for(InstanceState s: InstanceState.values())
        {
            if (s.getLiteral().equalsIgnoreCase(literal))
            {
                return s;
            }
        }

        throw new IllegalArgumentException("no InstanceState enum value for '" + literal + "'");
    }

    public String getLiteral()
    {
        return literal;
    }


}
