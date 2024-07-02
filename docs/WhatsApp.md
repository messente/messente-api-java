

# WhatsApp

WhatsApp message content.   Only one of \"text\", \"image\", \"document\" or \"audio\" can be provided

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sender** | **String** | Phone number or alphanumeric sender name |  [optional] |
|**validity** | **Integer** | After how many minutes this channel is   considered as failed and the next channel is attempted |  [optional] |
|**ttl** | **Integer** | After how many seconds this channel is considered as failed and the next channel is attempted.       Only one of \&quot;ttl\&quot; and \&quot;validity\&quot; can be used. |  [optional] |
|**text** | [**WhatsAppText**](WhatsAppText.md) |  |  [optional] |
|**image** | [**WhatsAppImage**](WhatsAppImage.md) |  |  [optional] |
|**document** | [**WhatsAppDocument**](WhatsAppDocument.md) |  |  [optional] |
|**audio** | [**WhatsAppAudio**](WhatsAppAudio.md) |  |  [optional] |
|**channel** | [**ChannelEnum**](#ChannelEnum) | The channel used to deliver the message |  [optional] |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| WHATSAPP | &quot;whatsapp&quot; |



