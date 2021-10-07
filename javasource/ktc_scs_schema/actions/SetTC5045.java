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

public class SetTC5045 extends CustomJavaAction<java.lang.String>
{
	private java.lang.String orderNo;
	private java.lang.String orderLine;

	public SetTC5045(IContext context, java.lang.String orderNo, java.lang.String orderLine)
	{
		super(context);
		this.orderNo = orderNo;
		this.orderLine = orderLine;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		StringBuilder strMessageDetail = new StringBuilder();
		
		try
		{
			strMessageDetail.append(MessageClass.setMessageNumber(this.orderNo,  7));
			strMessageDetail.append(MessageClass.setMessageNumber(this.orderLine,  3));
			/*strMessageDetail.append(MessageClass.setMessageNumber("0",  3));
			strMessageDetail.append(MessageClass.setMessageNumber("0", 15));
			strMessageDetail.append(MessageClass.setMessageNumber("0",  8));
			strMessageDetail.append(MessageClass.setMessageNumber("0", 14));
			strMessageDetail.append(MessageClass.setMessageNumber("0", 15));
			strMessageDetail.append(MessageClass.setMessageNumber("0", 15));*/
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
		return "SetTC5045";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
