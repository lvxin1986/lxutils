/**
 * 
 */
package com.lx.lxutils;

import java.util.Properties;

/**
 * @author bjlvxin
 *
 */
public class GetSystemProperties {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties p=System.getProperties();
		for(Object k:p.keySet())
		{
			System.out.println(((String)k)+"="+p.getProperty((String)k));
		}
	}

}
