package com.hexairbot.hexmini;

/**
 * @author koupoo
 */
public interface SettingsViewControllerDelegate {
	public void interfaceOpacityValueDidChange(float newValue);
	public void leftHandedValueDidChange(boolean isLeftHanded);
	public void accModeValueDidChange(boolean isAccMode);
	public void captureTelemetryDataValueDidChange(boolean isCaptureTelemetryData);
	public void headfreeModeValueDidChange(boolean isHeadfree);
	public void beginnerModeValueDidChange(boolean isBeginnerMode);
	public void hoverOnThrottleReleaseModeValueDidChange(boolean isHoverOnThrottleReleaseMode);
	public void aileronAndElevatorDeadBandValueDidChange(float newValue);
	public void rudderDeadBandValueDidChange(float newValue);
	
	public void didConnect();
	public void didDisconnect();
	public void didFailToConnect();
}
