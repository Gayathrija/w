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

public class SetTC1405 extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __TC1405;
	private ktc_scs_schema.proxies.TC1405_KNTPPD01DS TC1405;

	public SetTC1405(IContext context, IMendixObject TC1405)
	{
		super(context);
		this.__TC1405 = TC1405;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.TC1405 = __TC1405 == null ? null : ktc_scs_schema.proxies.TC1405_KNTPPD01DS.initialize(getContext(), __TC1405);

		// BEGIN USER CODE
		String strMessageApplication = "";
		
		try
		{
			strMessageApplication = MessageClass.setMessageNumber(this.TC1405.getLPSEQN(), 5)
					+ MessageClass.setMessageNumber(this.TC1405.getLPTERM(), 5)
					+ MessageClass.setMessageString(this.TC1405.getLPICDE(), 3)
					+ MessageClass.setMessageNumber(this.TC1405.getLPRAT1(), 5)
					+ MessageClass.setMessageNumber(this.TC1405.getLPRAT2(), 5)
					+ MessageClass.setMessageNumber(this.TC1405.getLPIVR1(), 5)
					+ MessageClass.setMessageNumber(this.TC1405.getLPSTFV(), 5)
					+ MessageClass.setMessageNumber(this.TC1405.getLPEFIR(), 5)
					+ MessageClass.setMessageNumber(this.TC1405.getLPEFFR(), 5)
					+ MessageClass.setMessageNumber(this.TC1405.getLPEFTR(), 5)
					+ MessageClass.setMessageNumber(this.TC1405.getLPGACC(), 19)
					+ MessageClass.setMessageNumber(this.TC1405.getLPKNTN(), 19)
					+ MessageClass.setMessageString(this.TC1405.getLPPPID(), 6)
					+ MessageClass.setMessageString(this.TC1405.getLPPPNT(), 10)
					+ MessageClass.setMessageString(this.TC1405.getLPPPNM(), 1)
					+ MessageClass.setMessageNumber(this.TC1405.getLPSTDT(), 8)
					+ MessageClass.setMessageNumber(this.TC1405.getLPENDT(), 8)
					+ MessageClass.setMessageNumber(this.TC1405.getLPTMPR(), 5)
					+ MessageClass.setMessageNumber(this.TC1405.getLPDTTM(), 14)
					+ MessageClass.setMessageNumber(this.TC1405.getLPDISR(), 5);
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
		return "SetTC1405";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
