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

public class SetTC3611 extends CustomJavaAction<java.lang.String>
{
	private java.lang.String customerNumber;
	private java.lang.String cardNumber;
	private java.lang.String emailStatementFlag;
	private java.lang.String dateAndTime;

	public SetTC3611(IContext context, java.lang.String customerNumber, java.lang.String cardNumber, java.lang.String emailStatementFlag, java.lang.String dateAndTime)
	{
		super(context);
		this.customerNumber = customerNumber;
		this.cardNumber = cardNumber;
		this.emailStatementFlag = emailStatementFlag;
		this.dateAndTime = dateAndTime;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		StringBuilder strMessageDetail = new StringBuilder();

		try {
			strMessageDetail.append(MessageClass.setMessageNumber(this.customerNumber, 19));		//	WDKIPN
			strMessageDetail.append(MessageClass.setMessageNumber(this.cardNumber, 19));			//	WDKRTN
			strMessageDetail.append(MessageClass.setMessageString(this.emailStatementFlag, 1));		//	WDESTM
			strMessageDetail.append(MessageClass.setMessageNumber(this.dateAndTime, 14));			//	WDDETM
		} catch (Exception ex) {
			throw ex;
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
		return "SetTC3611";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
