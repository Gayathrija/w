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

public class SetTC2225 extends CustomJavaAction<java.lang.String>
{
	private java.lang.String accountNumber;
	private java.lang.String cardNo;
	private java.lang.String customerNo;
	private java.lang.String accountType;

	public SetTC2225(IContext context, java.lang.String accountNumber, java.lang.String cardNo, java.lang.String customerNo, java.lang.String accountType)
	{
		super(context);
		this.accountNumber = accountNumber;
		this.cardNo = cardNo;
		this.customerNo = customerNo;
		this.accountType = accountType;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		String strMessageApplication = "";
		
		try
		{
			strMessageApplication = MessageClass.setMessageNumber(this.accountNumber, 19)
					+ MessageClass.setMessageNumber(this.cardNo, 19)
					+ MessageClass.setMessageNumber(this.customerNo, 19)
					+ MessageClass.setMessageString("", 40)
					+ MessageClass.setMessageString("", 40)
					+ MessageClass.setMessageString("", 40)
					+ MessageClass.setMessageString("", 40)
					+ MessageClass.setMessageString(this.accountType, 1)
					+ MessageClass.setMessageNumber("0", 19)
					+ MessageClass.setMessageString("", 40)
					+ MessageClass.setMessageString("", 1)
					+ MessageClass.setMessageNumber("0", 19)
					+ MessageClass.setMessageString("", 40)
					+ MessageClass.setMessageString("", 40)
					+ MessageClass.setMessageNumber("0", 14);
		}
		catch (Exception ex)
		{
			throw new com.mendix.systemwideinterfaces.MendixRuntimeException(ex.getMessage());
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
		return "SetTC2225";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
