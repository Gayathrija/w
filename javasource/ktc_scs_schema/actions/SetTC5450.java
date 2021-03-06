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
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class SetTC5450 extends CustomJavaAction<java.lang.String>
{
	private java.lang.String userID;

	public SetTC5450(IContext context, java.lang.String userID)
	{
		super(context);
		this.userID = userID;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		String strMessageApplication = "";
		

		StringBuffer sb = new StringBuffer();
		try
		{

			sb.append(MessageClass.setMessageNumber("0", 9));
			sb.append(MessageClass.setMessageNumber("0", 7));
			sb.append(MessageClass.setMessageNumber("0", 4));
			sb.append(MessageClass.setMessageNumber("0", 11));
			sb.append(MessageClass.setMessageNumber("0", 15));
			sb.append(MessageClass.setMessageString("", 3));
			sb.append(MessageClass.setMessageNumber("0", 7));
			sb.append(MessageClass.setMessageNumber("0", 8));
			sb.append(MessageClass.setMessageNumber("0", 8));
			sb.append(MessageClass.setMessageNumber("0", 3));
			sb.append(MessageClass.setMessageString("", 1));
			sb.append(MessageClass.setMessageString("", 15));
			sb.append(MessageClass.setMessageString(this.userID, 10));
		}
		catch (Exception ex)
		{
			throw ex;
		}
		
		return strMessageApplication.toString();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "SetTC5450";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
