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

public class SetTC8474 extends CustomJavaAction<java.lang.String>
{
	private java.lang.String householdAccountNo;
	private java.lang.String accountNo;

	public SetTC8474(IContext context, java.lang.String householdAccountNo, java.lang.String accountNo)
	{
		super(context);
		this.householdAccountNo = householdAccountNo;
		this.accountNo = accountNo;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE

		StringBuffer sb = new StringBuffer("");
		try {

			sb.append(MessageClass.setMessageNumber(this.householdAccountNo, 19));
			sb.append(MessageClass.setMessageNumber("0", 9));
			sb.append(MessageClass.setMessageNumber("0", 11));
			sb.append(MessageClass.setMessageNumber("0", 11));
			sb.append(MessageClass.setMessageNumber("0", 11));
			sb.append(MessageClass.setMessageNumber("0", 11));
			sb.append(MessageClass.setMessageNumber("0", 11));
			sb.append(MessageClass.setMessageNumber("0", 11));
			sb.append(MessageClass.setMessageNumber("0", 11));
			sb.append(MessageClass.setMessageNumber("0", 11));
			sb.append(MessageClass.setMessageString("", 15));
			sb.append(MessageClass.setMessageNumber("0", 8));
			sb.append(MessageClass.setMessageNumber("0", 8));
			sb.append(MessageClass.setMessageNumber("0", 8));
			sb.append(MessageClass.setMessageString("", 1));
			sb.append(MessageClass.setMessageString("", 1));
			sb.append(MessageClass.setMessageString("", 3));
			sb.append(MessageClass.setMessageNumber("0", 8));
			sb.append(MessageClass.setMessageString("", 10));
			sb.append(MessageClass.setMessageString("", 1));
			sb.append(MessageClass.setMessageNumber("0", 11));
			sb.append(MessageClass.setMessageNumber("0", 11));
			sb.append(MessageClass.setMessageNumber("0", 11));
			sb.append(MessageClass.setMessageNumber("0", 11));
			sb.append(MessageClass.setMessageString("", 1));
			sb.append(MessageClass.setMessageString("", 3));
			sb.append(MessageClass.setMessageNumber("0", 8));
			sb.append(MessageClass.setMessageString("", 1));
			sb.append(MessageClass.setMessageNumber("0", 14));
			sb.append(MessageClass.setMessageString("", 3));
			sb.append(MessageClass.setMessageString("", 1));
			sb.append(MessageClass.setMessageNumber(this.accountNo, 19));

		} catch (Exception ex) {
			throw new com.mendix.systemwideinterfaces.MendixRuntimeException(ex.getMessage());
		}

		return sb.toString();

		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "SetTC8474";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}