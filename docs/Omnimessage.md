
# Omnimessage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**to** | **String** | Phone number in e.164 format | 
**messages** | [**List&lt;OneOfViberSMSWhatsApp&gt;**](OneOfViberSMSWhatsApp.md) |  | 
**dlrUrl** | **String** | URL where the delivery report will be sent |  [optional]
**timeToSend** | [**OffsetDateTime**](OffsetDateTime.md) | Optional parameter for sending messages at some specific time in the future.   Time must be specified in the 8601 format.   If no timezone is specified, then the timezone is assumed to be UTC.    Examples:    * Time specified with timezone: 2018-06-22T09:05:07+00:00 Time specified in UTC: 2018-06-22T09:05:07Z   * Time specified without timezone: 2018-06-22T09:05 (equivalent to 2018-06-22T09:05+00:00) |  [optional]


