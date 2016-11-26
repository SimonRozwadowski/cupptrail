/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 26, 2016 1:38:11 AM                     ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 *  
 */
package de.hybris.platform.cuppytrail.jalo;

import de.hybris.platform.cuppytrail.constants.CuppytrailConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Stadium}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedStadium extends GenericItem
{
	/** Qualifier of the <code>Stadium.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Stadium.capacity</code> attribute **/
	public static final String CAPACITY = "capacity";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(CAPACITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stadium.capacity</code> attribute.
	 * @return the capacity - Capacity
	 */
	public Integer getCapacity(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CAPACITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stadium.capacity</code> attribute.
	 * @return the capacity - Capacity
	 */
	public Integer getCapacity()
	{
		return getCapacity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stadium.capacity</code> attribute. 
	 * @return the capacity - Capacity
	 */
	public int getCapacityAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCapacity( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stadium.capacity</code> attribute. 
	 * @return the capacity - Capacity
	 */
	public int getCapacityAsPrimitive()
	{
		return getCapacityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stadium.capacity</code> attribute. 
	 * @param value the capacity - Capacity
	 */
	public void setCapacity(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, CAPACITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stadium.capacity</code> attribute. 
	 * @param value the capacity - Capacity
	 */
	public void setCapacity(final Integer value)
	{
		setCapacity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stadium.capacity</code> attribute. 
	 * @param value the capacity - Capacity
	 */
	public void setCapacity(final SessionContext ctx, final int value)
	{
		setCapacity( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stadium.capacity</code> attribute. 
	 * @param value the capacity - Capacity
	 */
	public void setCapacity(final int value)
	{
		setCapacity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stadium.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stadium.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stadium.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stadium.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
}
