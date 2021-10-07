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

public class SetTC5490 extends CustomJavaAction<java.lang.String>
{
	private java.lang.String customerNumber;
	private java.lang.String cardNumber;

	public SetTC5490(IContext context, java.lang.String customerNumber, java.lang.String cardNumber)
	{
		super(context);
		this.customerNumber = customerNumber;
		this.cardNumber = cardNumber;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		StringBuffer sb = new StringBuffer();

		try {
			sb.append(MessageClass.setMessageNumber(this.customerNumber, 19));	//IPKIPN
			sb.append(MessageClass.setMessageNumber(this.cardNumber, 19));		//IPKRTN
		}
		catch (Exception ex)
		{
			throw ex;
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
		return "SetTC5490";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
