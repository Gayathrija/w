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

public class SetTC1239 extends CustomJavaAction<java.lang.String>
{
	private java.lang.String groupAccountNumber;

	public SetTC1239(IContext context, java.lang.String groupAccountNumber)
	{
		super(context);
		this.groupAccountNumber = groupAccountNumber;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		String strMessageApplication = "";
		
		try
		{
			strMessageApplication = MessageClass.setMessageNumber(this.groupAccountNumber, 19)
					+ MessageClass.setMessageNumber("0", 19)
					+ MessageClass.setMessageString("", 3)
					+ MessageClass.setMessageString("", 6)
					+ MessageClass.setMessageNumber("0", 8)
					+ MessageClass.setMessageNumber("0", 8)
					+ MessageClass.setMessageNumber("0", 5, 3)
					+ MessageClass.setMessageNumber("0", 5, 3)
					+ MessageClass.setMessageNumber("0", 5, 3)
					+ MessageClass.setMessageNumber("0", 14)
					+ MessageClass.setMessageNumber("0", 19)
					+ MessageClass.setMessageString("", 6)
					+ MessageClass.setMessageString("", 1);
		}
		catch (Exception ex)
		{
			throw ex;
		}
		return strMessageApplication;	
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "SetTC1239";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}