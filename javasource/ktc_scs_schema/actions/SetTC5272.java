// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package ktc_scs_schema.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import ktcmdwscsconnector.customs.MessageClass;

/**
 * KTC Customer Service
 * Action 1 - Account Registration Inquiry.
 */
public class SetTC5272 extends CustomJavaAction<java.lang.String>
{
	private java.lang.String customerNumber;

	public SetTC5272(IContext context, java.lang.String customerNumber)
	{
		super(context);
		this.customerNumber = customerNumber;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		StringBuilder strMessageDetail = new StringBuilder();
		
		try
		{
			strMessageDetail.append(MessageClass.setMessageNumber(this.customerNumber, 19));
			strMessageDetail.append(MessageClass.setMessageString("", 6));
			strMessageDetail.append(MessageClass.setMessageString("", 3));
			strMessageDetail.append(MessageClass.setMessageString("", 19));
			strMessageDetail.append(MessageClass.setMessageNumber("0", 2));
			strMessageDetail.append(MessageClass.setMessageString("", 1));
			strMessageDetail.append(MessageClass.setMessageNumber("0", 14));
			strMessageDetail.append(MessageClass.setMessageNumber("0", 14));
			strMessageDetail.append(MessageClass.setMessageString("", 3));
			strMessageDetail.append(MessageClass.setMessageString("", 40));
			strMessageDetail.append(MessageClass.setMessageString("", 3));
			strMessageDetail.append(MessageClass.setMessageString("", 200));
			strMessageDetail.append(MessageClass.setMessageString("", 80));
			strMessageDetail.append(MessageClass.setMessageString("", 3));
		}
		catch (Exception ex)
		{
			throw new com.mendix.systemwideinterfaces.MendixRuntimeException(ex.getMessage());
		}
		
		return strMessageDetail.toString();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "SetTC5272";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
