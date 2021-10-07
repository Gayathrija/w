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

public class SetTC5417 extends CustomJavaAction<java.lang.String>
{
	private java.lang.String BatchNo;
	private java.lang.String BatchSeqNo;
	private java.lang.String TransactionCode;

	public SetTC5417(IContext context, java.lang.String BatchNo, java.lang.String BatchSeqNo, java.lang.String TransactionCode)
	{
		super(context);
		this.BatchNo = BatchNo;
		this.BatchSeqNo = BatchSeqNo;
		this.TransactionCode = TransactionCode;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		String strMessageApplication = "";
		try
		{
			strMessageApplication = MessageClass.setMessageNumber(this.BatchNo, 9)
					+ MessageClass.setMessageNumber(this.BatchSeqNo,  7)
					+ MessageClass.setMessageNumber(this.TransactionCode,  4)
					+ MessageClass.setMessageNumber("0", 19)
					+ MessageClass.setMessageString("", 6)
					+ MessageClass.setMessageNumber("0",  8)
					+ MessageClass.setMessageNumber("0",  8)
					+ MessageClass.setMessageNumber("0",  8)
					+ MessageClass.setMessageNumber("0",  8)
					+ MessageClass.setMessageNumber("0",  23)
					+ MessageClass.setMessageNumber("0",  15)
					+ MessageClass.setMessageString("", 3)
					+ MessageClass.setMessageNumber("0",  15)
					+ MessageClass.setMessageString("", 3)
					+ MessageClass.setMessageNumber("0",  15)
					+ MessageClass.setMessageString("", 3)
					+ MessageClass.setMessageNumber("0",  15)
					+ MessageClass.setMessageString("", 3)
					+ MessageClass.setMessageString("", 15)
					+ MessageClass.setMessageString("", 15)
					+ MessageClass.setMessageString("", 4)
					+ MessageClass.setMessageNumber("0",  11)
					+ MessageClass.setMessageString("", 40)
					+ MessageClass.setMessageString("", 40)
					+ MessageClass.setMessageString("", 50)
					+ MessageClass.setMessageString("", 10)
					+ MessageClass.setMessageNumber("0",  8)
					+ MessageClass.setMessageNumber("0",  6)
					+ MessageClass.setMessageNumber("0",  9)
					+ MessageClass.setMessageNumber("0",  7)
					+ MessageClass.setMessageString("", 8)
					+ MessageClass.setMessageNumber("0",  9)
					+ MessageClass.setMessageNumber("0",  7)
					+ MessageClass.setMessageNumber("0",  19)
					+ MessageClass.setMessageNumber("0",  3)
					+ MessageClass.setMessageString("", 1)
					+ MessageClass.setMessageNumber("0",  6)
					+ MessageClass.setMessageNumber("0",  6)
					+ MessageClass.setMessageString("", 15)
					+ MessageClass.setMessageString("", 6)
					+ MessageClass.setMessageNumber("0",  3)
					+ MessageClass.setMessageString("", 1)
					+ MessageClass.setMessageString("", 15)
					+ MessageClass.setMessageString("", 1)
					+ MessageClass.setMessageNumber("0",  4)
					+ MessageClass.setMessageString("", 1)
					+ MessageClass.setMessageString("", 1)
					+ MessageClass.setMessageNumber("0",  14)
					+ MessageClass.setMessageNumber("0",  7)
					+ MessageClass.setMessageString("", 1)
					+ MessageClass.setMessageNumber("0",  5)
					+ MessageClass.setMessageNumber("0",  15)
					+ MessageClass.setMessageNumber("0",  1)
					+ MessageClass.setMessageNumber("0",  1)
					+ MessageClass.setMessageNumber("0",  1)
					+ MessageClass.setMessageNumber("0",  1)
					+ MessageClass.setMessageString("", 1)
					+ MessageClass.setMessageString("", 3)
					+ MessageClass.setMessageString("", 1)
					+ MessageClass.setMessageString("", 1)
					+ MessageClass.setMessageString("", 2)
					+ MessageClass.setMessageString("", 19)
					+ MessageClass.setMessageString("", 1)
					+ MessageClass.setMessageNumber("0", 10)
					+ MessageClass.setMessageString("", 8)
					+ MessageClass.setMessageString("", 1)
					+ MessageClass.setMessageString("", 4)
					+ MessageClass.setMessageNumber("0", 4)
					+ MessageClass.setMessageString("", 15)
					+ MessageClass.setMessageString("", 3)
					+ MessageClass.setMessageNumber("0", 4)
					+ MessageClass.setMessageString("", 4)
					+ MessageClass.setMessageNumber("0", 13)
					+ MessageClass.setMessageString("", 1)
					+ MessageClass.setMessageString("", 1)
					+ MessageClass.setMessageString("", 1)
					+ MessageClass.setMessageString("", 1)
					+ MessageClass.setMessageString("", 16)
					+ MessageClass.setMessageString("", 2)
					+ MessageClass.setMessageNumber("0", 3)
					+ MessageClass.setMessageString("", 2)
					+ MessageClass.setMessageString("", 1)
					+ MessageClass.setMessageNumber("0", 5)
					+ MessageClass.setMessageNumber("0", 5)
					+ MessageClass.setMessageString("", 3)
					+ MessageClass.setMessageString("", 2)
					+ MessageClass.setMessageString("", 4)
					+ MessageClass.setMessageString("", 1)
					+ MessageClass.setMessageString("", 10)
					+ MessageClass.setMessageNumber("0", 2)
					+ MessageClass.setMessageString("", 1)
					+ MessageClass.setMessageNumber("0", 4)
					+ MessageClass.setMessageNumber("0", 4)
					+ MessageClass.setMessageString("", 25)
					+ MessageClass.setMessageString("", 9)
					+ MessageClass.setMessageString("", 3)
					+ MessageClass.setMessageNumber("0", 19)
					+ MessageClass.setMessageNumber("0", 19)
					+ MessageClass.setMessageString("", 5)    // Wallet Name
			        + MessageClass.setMessageString("", 5)
			        + MessageClass.setMessageString("", 1);
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
		return "SetTC5417";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
