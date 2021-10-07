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
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class SetTC5352 extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __mxObject;
	private ktc_scs_schema.proxies.TC5352_BNTAVS01DS mxObject;

	public SetTC5352(IContext context, IMendixObject mxObject)
	{
		super(context);
		this.__mxObject = mxObject;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.mxObject = __mxObject == null ? null : ktc_scs_schema.proxies.TC5352_BNTAVS01DS.initialize(getContext(), __mxObject);

		// BEGIN USER CODE
		StringBuffer sb = new StringBuffer();
		try
		{
			sb.append(MessageClass.setMessageNumber(mxObject.getBNBNTN(), 9));
			sb.append(MessageClass.setMessageNumber(mxObject.getBNBLON(), 7));
			sb.append(MessageClass.setMessageNumber(mxObject.getBNTTYP(), 4));
			sb.append(MessageClass.setMessageNumber(mxObject.getBNBKID(), 11));
			sb.append(MessageClass.setMessageNumber(mxObject.getBNBEL(), 15));
			sb.append(MessageClass.setMessageString(mxObject.getBNCCDE(), 3));
			sb.append(MessageClass.setMessageNumber(mxObject.getBNBANT(), 7));
			sb.append(MessageClass.setMessageNumber(mxObject.getBNEDAT(), 8));
			sb.append(MessageClass.setMessageNumber(mxObject.getBNBDAT(), 8));
			sb.append(MessageClass.setMessageNumber(mxObject.getBNBNST(), 3));
			sb.append(MessageClass.setMessageString(mxObject.getBNKORR(), 1));
			sb.append(MessageClass.setMessageString(mxObject.getBNEREF(), 15));
			sb.append(MessageClass.setMessageString(mxObject.getBNUSER(), 10));
			sb.append(MessageClass.setMessageNumber(mxObject.getBNDTTM(), 14));
			sb.append(MessageClass.setMessageString(mxObject.getBNBPNM(), 40));
			sb.append(MessageClass.setMessageNumber(mxObject.getWDFROM(), 8));
			sb.append(MessageClass.setMessageNumber(mxObject.getWDTOM(), 8));
			sb.append(MessageClass.setMessageNumber(mxObject.getWDBKID(), 11));
			sb.append(MessageClass.setMessageString(mxObject.getWDRKID(), 6));
			sb.append(MessageClass.setMessageString(mxObject.getBNUAPV(), 10));
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
		return "SetTC5352";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}