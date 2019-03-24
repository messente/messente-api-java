
# DeliveryResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**Status**](Status.md) |  |  [optional]
**channel** | [**Channel**](Channel.md) |  |  [optional]
**messageId** | [**UUID**](UUID.md) | Unique identifier for the message |  [optional]
**error** | **String** | Human-readable description of what went wrong, *null* in case of success or if the messages has not been processed yet |  [optional]
**err** | [**ErrorCodeOmnichannelMachine**](ErrorCodeOmnichannelMachine.md) |  |  [optional]
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | When this status was received by Omnichannel API |  [optional]


