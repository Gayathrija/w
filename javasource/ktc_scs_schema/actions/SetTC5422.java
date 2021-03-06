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

public class SetTC5422 extends CustomJavaAction<java.lang.String>
{
	private java.lang.String BatchNo;
	private java.lang.String BatchSeqNo;
	private java.lang.String DateAndTime;

	public SetTC5422(IContext context, java.lang.String BatchNo, java.lang.String BatchSeqNo, java.lang.String DateAndTime)
	{
		super(context);
		this.BatchNo = BatchNo;
		this.BatchSeqNo = BatchSeqNo;
		this.DateAndTime = DateAndTime;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		String strMessageApplication = "";
		try
		{
			strMessageApplication = MessageClass.setMessageNumber(this.BatchNo, 9)
					+ MessageClass.setMessageNumber(this.BatchSeqNo, 7)
					+ MessageClass.setMessageNumber(this.DateAndTime, 14);
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
		return "SetTC5422";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
