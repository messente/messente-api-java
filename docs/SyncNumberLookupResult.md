

# SyncNumberLookupResult

Info about a phone number

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**number** | **String** | Phone number in e.164 format |  |
|**roaming** | **Boolean** | Indicates if a number is roaming |  [optional] |
|**ported** | **Boolean** | Indicates if a number is ported |  [optional] |
|**roamingNetwork** | [**MobileNetwork**](MobileNetwork.md) |  |  [optional] |
|**currentNetwork** | [**MobileNetwork**](MobileNetwork.md) |  |  [optional] |
|**originalNetwork** | [**MobileNetwork**](MobileNetwork.md) |  |  [optional] |
|**portedNetwork** | [**MobileNetwork**](MobileNetwork.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the phone number |  [optional] |
|**error** | **Object** | Indicates if any error occurred while handling the request |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ON | &quot;ON&quot; |
| OFF | &quot;OFF&quot; |
| INVALID | &quot;INVALID&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



