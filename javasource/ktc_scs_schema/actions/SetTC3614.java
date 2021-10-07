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

public class SetTC3614 extends CustomJavaAction<java.lang.String>
{
	private java.lang.String cardNumber;
	private java.lang.String creditLimitRequested;
	private java.lang.String effectiveDate;
	private java.lang.String expiryDate;

	public SetTC3614(IContext context, java.lang.String cardNumber, java.lang.String creditLimitRequested, java.lang.String effectiveDate, java.lang.String expiryDate)
	{
		super(context);
		this.cardNumber = cardNumber;
		this.creditLimitRequested = creditLimitRequested;
		this.effectiveDate = effectiveDate;
		this.expiryDate = expiryDate;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		StringBuilder strMessageDetail = new StringBuilder();
		
		try
		{
			strMessageDetail.append(MessageClass.setMessageNumber(this.cardNumber, 19));				//	LPKRTN
			strMessageDetail.append(MessageClass.setMessageNumber(this.creditLimitRequested, 11));		//	LPRLIM
			strMessageDetail.append(MessageClass.setMessageNumber(this.effectiveDate, 8));				//	LPEFDT
			strMessageDetail.append(MessageClass.setMessageNumber(this.expiryDate, 8));					//	LPEXDT
			strMessageDetail.append(MessageClass.setMessageString("", 40));								//	IPOLIC
		}
		catch (Exception ex)
		{
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
		return "SetTC3614";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
