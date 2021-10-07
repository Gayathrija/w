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

public class SetTCVC860072 extends CustomJavaAction<java.lang.String>
{
	private java.lang.String merchandizingItemCode;
	private java.lang.String itemSupplierID;

	public SetTCVC860072(IContext context, java.lang.String merchandizingItemCode, java.lang.String itemSupplierID)
	{
		super(context);
		this.merchandizingItemCode = merchandizingItemCode;
		this.itemSupplierID = itemSupplierID;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		StringBuffer sb = new StringBuffer();

		try {
			sb.append(MessageClass.setMessageString(this.merchandizingItemCode, 10));
			sb.append(MessageClass.setMessageNumber(this.itemSupplierID, 19));

			
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
		return "SetTCVC860072";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
