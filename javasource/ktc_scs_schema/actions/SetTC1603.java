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

public class SetTC1603 extends CustomJavaAction<java.lang.String>
{
	private java.lang.String cardNumber;
	private java.lang.String transactionAmount;
	private java.lang.String authCode;
	private java.lang.String customerName;

	public SetTC1603(IContext context, java.lang.String cardNumber, java.lang.String transactionAmount, java.lang.String authCode, java.lang.String customerName)
	{
		super(context);
		this.cardNumber = cardNumber;
		this.transactionAmount = transactionAmount;
		this.authCode = authCode;
		this.customerName = customerName;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		StringBuilder strMessageDetail = new StringBuilder();
		
		try
		{
			strMessageDetail.append(MessageClass.setMessageNumber(this.cardNumber, 19));			
			strMessageDetail.append(MessageClass.setMessageNumber(this.transactionAmount, 15, 2));	
			strMessageDetail.append(MessageClass.setMessageString(this.authCode, 6));				
			strMessageDetail.append(MessageClass.setMessageString(this.customerName, 40));			
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
		return "SetTC1603";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
