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

public class SetTC5209 extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __mxObject;
	private ktc_scs_schema.proxies.TC5209_CUSOBKDS mxObject;

	public SetTC5209(IContext context, IMendixObject mxObject)
	{
		super(context);
		this.__mxObject = mxObject;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.mxObject = __mxObject == null ? null : ktc_scs_schema.proxies.TC5209_CUSOBKDS.initialize(getContext(), __mxObject);

		// BEGIN USER CODE
		String strMessageApplication = "";

		try {
			strMessageApplication = MessageClass.setMessageNumber(this.mxObject.getCUKIPN(), 19)
					+ MessageClass.setMessageString(this.mxObject.getCUACT3(), 3)
					+ MessageClass.setMessageNumber(this.mxObject.getCUSEQ1(), 4)
					+ MessageClass.setMessageString(this.mxObject.getCUBNM3(), 40)
					+ MessageClass.setMessageNumber(this.mxObject.getCUBAC3(), 19)
					+ MessageClass.setMessageNumber(this.mxObject.getCUBOD3(), 11)
					+ MessageClass.setMessageNumber(this.mxObject.getCUDTTM(), 14);
		}catch (Exception ex) {
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
		return "SetTC5209";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
