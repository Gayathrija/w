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

public class SetTC9979 extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __mxObject;
	private ktc_scs_schema.proxies.TC9979_KORTRG05DS mxObject;

	public SetTC9979(IContext context, IMendixObject mxObject)
	{
		super(context);
		this.__mxObject = mxObject;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.mxObject = __mxObject == null ? null : ktc_scs_schema.proxies.TC9979_KORTRG05DS.initialize(getContext(), __mxObject);

		// BEGIN USER CODE
		StringBuilder strMessageApplication = new StringBuilder();
		
		try
		{
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getWDBNTN(), 9));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTKRTN(), 19));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTEMNM(), 26));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTGTDT(), 6));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTKTTP(), 3));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTCLEC(), 6));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTSRVC(), 3));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTPVKI(), 2));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTPVV(), 4));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getWDBANT(), 7));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getWDRANT(), 7));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getWDDANT(), 7));
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
		return "SetTC9979";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
