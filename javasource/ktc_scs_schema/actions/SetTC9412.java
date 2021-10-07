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

public class SetTC9412 extends CustomJavaAction<java.lang.String>
{
	private java.lang.String CardNumber;
	private java.lang.String AccountNumber;

	public SetTC9412(IContext context, java.lang.String CardNumber, java.lang.String AccountNumber)
	{
		super(context);
		this.CardNumber = CardNumber;
		this.AccountNumber = AccountNumber;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		StringBuilder strMessageApplication = new StringBuilder();
		
		try
		{
			strMessageApplication.append(MessageClass.setMessageNumber(this.CardNumber, 19));
			strMessageApplication.append(MessageClass.setMessageNumber(this.AccountNumber, 19));
		}
		catch (Exception ex)
		{
			throw new com.mendix.systemwideinterfaces.MendixRuntimeException(ex.getMessage());
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
		return "SetTC9412";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}