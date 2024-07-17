

# DeliveryResult

A delivery report

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **Status** |  |  [optional] |
|**channel** | **Channel** |  |  [optional] |
|**messageId** | **UUID** | Unique identifier for the message |  [optional] |
|**error** | **String** | Human-readable description of what went wrong, *null* in case of success or if the message has not been processed yet |  [optional] |
|**err** | **ErrorCodeOmnichannelMachine** |  |  [optional] |
|**timestamp** | **OffsetDateTime** | When this status was received by Omnichannel API |  [optional] |
|**priceInfo** | [**PriceInfo**](PriceInfo.md) |  |  [optional] |



