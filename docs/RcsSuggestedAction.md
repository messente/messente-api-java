

# RcsSuggestedAction

RCS suggested action.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**text** | **String** | The text of the suggested action. Exactly one of the action fields (types) must be provided. |  |
|**postbackData** | **String** | The postback data associated with the suggested action. This is sent back to the sender when the user selects the suggested action. |  |
|**fallbackUrl** | **String** | The fallback URL to open if the suggested action is not supported. |  [optional] |
|**dialAction** | [**RcsDialAction**](RcsDialAction.md) |  |  [optional] |
|**viewLocationAction** | [**RcsViewLocationAction**](RcsViewLocationAction.md) |  |  [optional] |
|**createCalendarEventAction** | [**RcsCreateCalendarEventAction**](RcsCreateCalendarEventAction.md) |  |  [optional] |
|**openUrlAction** | [**RcsOpenUrlAction**](RcsOpenUrlAction.md) |  |  [optional] |
|**shareLocationAction** | **Object** | This action does not have any properties. It simply triggers the share location action. |  [optional] |



