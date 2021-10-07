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

public class SetTC5486 extends CustomJavaAction<java.lang.String>
{
	private java.lang.String embossingName;

	public SetTC5486(IContext context, java.lang.String embossingName)
	{
		super(context);
		this.embossingName = embossingName;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		String strMessageApplication = "";
		try
		{
			strMessageApplication = MessageClass.setMessageNumber("0", 19)
					+ MessageClass.setMessageNumber("0", 19)
					+ MessageClass.setMessageString("", 80)
					+ MessageClass.setMessageString("", 40)
					+ MessageClass.setMessageString("", 40)
					+ MessageClass.setMessageString("", 40)
					+ MessageClass.setMessageString("", 40)
					+ MessageClass.setMessageString("", 20)
					+ MessageClass.setMessageString("", 20)
					+ MessageClass.setMessageString("", 20)
					+ MessageClass.setMessageString("", 20)
					+ MessageClass.setMessageString(this.embossingName, 26);
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
		return "SetTC5486";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}