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

public class SetTC5003 extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __TC5003;
	private ktc_scs_schema.proxies.TC5003_KORTRG01DS TC5003;

	public SetTC5003(IContext context, IMendixObject TC5003)
	{
		super(context);
		this.__TC5003 = TC5003;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.TC5003 = __TC5003 == null ? null : ktc_scs_schema.proxies.TC5003_KORTRG01DS.initialize(getContext(), __TC5003);

		// BEGIN USER CODE
		String strMessageApplication = "";
		
		try
		{
			strMessageApplication = MessageClass.setMessageNumber(this.TC5003.getKTLOPN(), 11)
					+ MessageClass.setMessageNumber(this.TC5003.getKTKRTN(), 19)
					+ MessageClass.setMessageString(this.TC5003.getKTEMNM(), 26)
					+ MessageClass.setMessageString(this.TC5003.getANATP1(), 1)
					+ MessageClass.setMessageNumber(this.TC5003.getKTKRST(), 3)
					+ MessageClass.setMessageString(this.TC5003.getKTSPKD(), 1)
					+ MessageClass.setMessageNumber(this.TC5003.getKTLEMD(), 8)
					+ MessageClass.setMessageString(this.TC5003.getKTREMC(), 2);
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
		return "SetTC5003";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
