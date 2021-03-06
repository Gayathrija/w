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

public class SetTC8215 extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __mxObject;
	private ktc_scs_schema.proxies.TC8215_ADDRES01DS mxObject;

	public SetTC8215(IContext context, IMendixObject mxObject)
	{
		super(context);
		this.__mxObject = mxObject;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.mxObject = __mxObject == null ? null : ktc_scs_schema.proxies.TC8215_ADDRES01DS.initialize(getContext(), __mxObject);

		// BEGIN USER CODE
		String strMessageApplication = "";

		try {
			strMessageApplication = MessageClass.setMessageNumber(this.mxObject.getAXKIPN(), 19)
					+ MessageClass.setMessageString(this.mxObject.getAXADTP(), 1)
					+ MessageClass.setMessageNumber(this.mxObject.getAXSEQ1(), 4)
					+ MessageClass.setMessageString(this.mxObject.getAXADR1(), 40)
					+ MessageClass.setMessageString(this.mxObject.getAXADR2(), 40)
					+ MessageClass.setMessageString(this.mxObject.getAXADR3(), 40)
					+ MessageClass.setMessageString(this.mxObject.getAXADR4(), 40)
					+ MessageClass.setMessageString(this.mxObject.getAXPNR(), 9)
					+ MessageClass.setMessageString(this.mxObject.getAXCITY(), 40)
					+ MessageClass.setMessageString(this.mxObject.getAXLSTE(), 3)
					+ MessageClass.setMessageString(this.mxObject.getAXCNCD(), 3)
					+ MessageClass.setMessageString(this.mxObject.getAXADRF(), 1)
					+ MessageClass.setMessageString(this.mxObject.getWDCBIL(), 1)
					+ MessageClass.setMessageNumber(this.mxObject.getAXDTTM(), 14);

		} catch (Exception ex) {
			throw new com.mendix.systemwideinterfaces.MendixRuntimeException(ex.getMessage());
		}

		return strMessageApplication;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "SetTC8215";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
