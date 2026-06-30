

# Viber

Viber message content. You must provide one of these combinations:  * image_url  * text  * text, button_text and button_url  * text, image_url, button_text and button_url  * video  * video, text  * video, text, button_text  * video, text, button_text and button_url  * carousel and text

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sender** | **String** | Phone number or alphanumeric sender name |  [optional] |
|**validity** | **Integer** | After how many minutes this channel is considered as failed and the next channel is attempted.       Only one of \&quot;ttl\&quot; and \&quot;validity\&quot; can be used. |  [optional] |
|**ttl** | **Integer** | After how many seconds this channel is considered as failed and the next channel is attempted.       Only one of \&quot;ttl\&quot; and \&quot;validity\&quot; can be used. |  [optional] |
|**text** | **String** | Plaintext content for Viber |  [optional] |
|**imageUrl** | **String** | URL for the embedded image. |  [optional] |
|**buttonUrl** | **String** | URL of the button, must be specified along with &#39;&#39;text&#39;&#39;, &#39;&#39;button_text&#39;&#39; and &#39;&#39;image_url&#39;&#39; (optional) |  [optional] |
|**buttonText** | **String** | Must be specified along with &#39;&#39;text&#39;&#39;, &#39;&#39;button_url&#39;&#39;, &#39;&#39;button_text&#39;&#39;, &#39;&#39;image_url&#39;&#39; (optional) |  [optional] |
|**channel** | [**ChannelEnum**](#ChannelEnum) | The channel used to deliver the message |  [optional] |
|**video** | [**ViberVideo**](ViberVideo.md) |  |  [optional] |
|**template** | [**ViberTemplate**](ViberTemplate.md) |  |  [optional] |
|**carousel** | [**ViberCarousel**](ViberCarousel.md) |  |  [optional] |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| VIBER | &quot;viber&quot; |



