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

public class SetTC9209 extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __TC9209;
	private ktc_scs_schema.proxies.TC9209_CUSOBKDS TC9209;

	public SetTC9209(IContext context, IMendixObject TC9209)
	{
		super(context);
		this.__TC9209 = TC9209;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.TC9209 = __TC9209 == null ? null : ktc_scs_schema.proxies.TC9209_CUSOBKDS.initialize(getContext(), __TC9209);

		// BEGIN USER CODE
		String strMessageApplication = "";
		
		try
		{
			strMessageApplication = MessageClass.setMessageNumber(this.TC9209.getCUKIPN(), 19)
					+ MessageClass.setMessageString(this.TC9209.getCUACT3(), 3)
					+ MessageClass.setMessageNumber(this.TC9209.getCUSEQ1(), 4)
					+ MessageClass.setMessageString(this.TC9209.getCUBNM3(), 40)
					+ MessageClass.setMessageNumber(this.TC9209.getCUBAC3(), 19)
					+ MessageClass.setMessageNumber(this.TC9209.getCUBOD3(), 11)
					+ MessageClass.setMessageNumber(this.TC9209.getCUDTTM(), 14);
		}
		catch (Exception ex)
		{
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
		return "SetTC9209";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}