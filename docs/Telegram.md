

# Telegram

Telegram message content

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sender** | **String** | Phone number or alphanumeric sender name |  [optional] |
|**validity** | **Integer** | After how many minutes this channel is considered as failed and the next channel is attempted |  [optional] |
|**text** | **String** | Plaintext content for Telegram |  [optional] |
|**imageUrl** | **String** | URL for the embedded image. Mutually exclusive with \&quot;document_url\&quot; and \&quot;audio_url\&quot; |  [optional] |
|**documentUrl** | **String** | URL for the embedded image. Mutually exclusive with \&quot;audio_url\&quot; and \&quot;image_url\&quot; |  [optional] |
|**audioUrl** | **String** | URL for the embedded image. Mutually exclusive with \&quot;document_url\&quot; and \&quot;image_url\&quot; |  [optional] |
|**channel** | [**ChannelEnum**](#ChannelEnum) | The channel used to deliver the message |  [optional] |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| TELEGRAM | &quot;telegram&quot; |



