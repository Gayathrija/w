// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package ktc_scs_schema.actions;

import org.apache.commons.lang3.StringUtils;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import ktcmdwscsconnector.customs.MessageClass;

public class SetTC7580 extends CustomJavaAction<java.lang.String>
{
	private java.lang.String merchantID;
	private java.lang.String terminalID;

	public SetTC7580(IContext context, java.lang.String merchantID, java.lang.String terminalID)
	{
		super(context);
		this.merchantID = merchantID;
		this.terminalID = terminalID;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		StringBuilder strMessageDetail = new StringBuilder();
		
		try
		{
			//Merchant ID
			if (StringUtils.isNotBlank(this.merchantID))
			{
				strMessageDetail.append(MessageClass.setMessageNumber(this.merchantID, 11));	//	BKBKID
			}
			
			//Terminal ID
			if (StringUtils.isNotBlank(this.terminalID))
			{
				strMessageDetail.append(MessageClass.setMessageString(this.terminalID, 8));		//	BKTMID
			}
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
		return "SetTC7580";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}