

# Rcs

RCS message object. Exactly one of 'text', 'content_info' or 'rich_card' must be provided.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channel** | [**ChannelEnum**](#ChannelEnum) | The channel used to deliver the message |  [optional] |
|**sender** | **String** | Phone number or alphanumeric sender name |  |
|**validity** | **Integer** | After how many minutes this channel is considered as failed and the next channel is attempted.Only one of \&quot;ttl\&quot; and \&quot;validity\&quot; can be used. |  [optional] |
|**ttl** | **Integer** | After how many seconds this channel is considered as failed and the next channel is attempted. Only one of \&quot;ttl\&quot; and \&quot;validity\&quot; can be used. |  [optional] |
|**text** | **String** | Text content of the RCS message |  [optional] |
|**suggestions** | [**List&lt;RcsSuggestion&gt;**](RcsSuggestion.md) | List of suggestions to include with the message |  [optional] |
|**richCard** | [**RcsRichCard**](RcsRichCard.md) |  |  [optional] |
|**contentInfo** | [**RcsContentInfo**](RcsContentInfo.md) |  |  [optional] |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| RCS | &quot;rcs&quot; |



