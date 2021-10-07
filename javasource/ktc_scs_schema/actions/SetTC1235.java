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

public class SetTC1235 extends CustomJavaAction<java.lang.String>
{
	private java.lang.String customerNo;
	private java.lang.String cardNo;

	public SetTC1235(IContext context, java.lang.String customerNo, java.lang.String cardNo)
	{
		super(context);
		this.customerNo = customerNo;
		this.cardNo = cardNo;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
				StringBuilder strMessageDetail = new StringBuilder();
				
				try
				{
					strMessageDetail.append( MessageClass.setMessageNumber(this.customerNo, 19) +
							                 MessageClass.setMessageNumber(this.cardNo, 19));
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
		return "SetTC1235";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
