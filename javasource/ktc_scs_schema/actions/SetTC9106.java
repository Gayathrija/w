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
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import ktcmdwscsconnector.customs.MessageClass;

public class SetTC9106 extends CustomJavaAction<java.lang.String>
{
	private java.lang.String TransactionCode;
	private java.lang.String DefaultTransactionDate;
	private java.lang.String MerchantID;
	private java.lang.String TotalAmount;
	private java.lang.String NoOfTransaction;

	public SetTC9106(IContext context, java.lang.String TransactionCode, java.lang.String DefaultTransactionDate, java.lang.String MerchantID, java.lang.String TotalAmount, java.lang.String NoOfTransaction)
	{
		super(context);
		this.TransactionCode = TransactionCode;
		this.DefaultTransactionDate = DefaultTransactionDate;
		this.MerchantID = MerchantID;
		this.TotalAmount = TotalAmount;
		this.NoOfTransaction = NoOfTransaction;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		StringBuilder strMessageApplication = new StringBuilder();
		
		try
		{
			strMessageApplication.append(MessageClass.setMessageNumber("0", 9));
			strMessageApplication.append(MessageClass.setMessageNumber("0", 7));
			strMessageApplication.append(MessageClass.setMessageNumber("0", 7));
			strMessageApplication.append(MessageClass.setMessageNumber(this.TransactionCode, 4));
			strMessageApplication.append(MessageClass.setMessageNumber(this.DefaultTransactionDate, 8));
			strMessageApplication.append(MessageClass.setMessageNumber(this.MerchantID, 11));
			strMessageApplication.append(MessageClass.setMessageNumber("0", 15));
			strMessageApplication.append(MessageClass.setMessageString("", 3));
			strMessageApplication.append(MessageClass.setMessageString("", 15));
			strMessageApplication.append(MessageClass.setMessageString("", 1));
			strMessageApplication.append(MessageClass.setMessageString("", 1));
			strMessageApplication.append(MessageClass.setMessageString("", 15));
			strMessageApplication.append(MessageClass.setMessageNumber("0", 5));
			strMessageApplication.append(MessageClass.setMessageString("", 40));
			strMessageApplication.append(MessageClass.setMessageString("", 1));
			strMessageApplication.append(MessageClass.setMessageNumber("0", 14));
			strMessageApplication.append(MessageClass.setMessageNumber(this.TotalAmount, 15));
			strMessageApplication.append(MessageClass.setMessageNumber(this.NoOfTransaction, 7));
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
		return "SetTC9106";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}