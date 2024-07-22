# Messente API Library

- Messente API version: 2.0.0
- Java artifact version: 4.2.0

[Messente](https://messente.com) is a global provider of messaging and user verification services.  * Send and receive SMS, Viber, WhatsApp and Telegram messages. * Manage contacts and groups. * Fetch detailed info about phone numbers. * Blacklist phone numbers to make sure you&#39;re not sending any unwanted messages.  Messente builds [tools](https://messente.com/documentation) to help organizations connect their services to people anywhere in the world.

## Installation

Install Messente API library via Maven, Gradle, Ivy or manual build.

### Gradle

```groovy
compile "com.messente.api:messente-api:4.2.0"
```

### Maven

```xml
<dependency>
  <groupId>com.messente.api</groupId>
  <artifactId>messente-api</artifactId>
  <version>4.2.0</version>
  <type>pom</type>
</dependency>
```

### Ivy

```xml
<dependency org='com.messente.api' name='messente-api' rev='4.2.0'>
  <artifact name='messente-api' ext='pom' ></artifact>
</dependency>
```

### Manual Build

Generate

```shell
mvn clean package
```

Install

- `target/messente-api-4.2.0.jar`
- `target/lib/*.jar`

## Features

Messente API has the following features:

- Omnichannel ([external docs](https://messente.com/documentation/omnichannel-api)),
- Phonebook ([external docs](https://messente.com/documentation/phonebook-api)).

Messente API Library provides the operations described below to access the features.

### BlacklistApi

1. Adds a phone number to the blacklist [`addToBlacklist`](docs/BlacklistApi.md#addtoblacklist)
1. Deletes a phone number from the blacklist [`deleteFromBlacklist`](docs/BlacklistApi.md#deletefromblacklist)
1. Returns all blacklisted phone numbers [`fetchBlacklist`](docs/BlacklistApi.md#fetchblacklist)
1. Checks if a phone number is blacklisted [`isBlacklisted`](docs/BlacklistApi.md#isblacklisted)

### BulkMessagingApi

1. Sends a bulk Omnimessage [`sendBulkOmnimessage`](docs/BulkMessagingApi.md#sendbulkomnimessage)

### ContactsApi

1. Adds a contact to a group [`addContactToGroup`](docs/ContactsApi.md#addcontacttogroup)
1. Creates a new contact [`createContact`](docs/ContactsApi.md#createcontact)
1. Deletes a contact [`deleteContact`](docs/ContactsApi.md#deletecontact)
1. Lists a contact [`fetchContact`](docs/ContactsApi.md#fetchcontact)
1. Lists groups of a contact [`fetchContactGroups`](docs/ContactsApi.md#fetchcontactgroups)
1. Returns all contacts [`fetchContacts`](docs/ContactsApi.md#fetchcontacts)
1. Removes a contact from a group [`removeContactFromGroup`](docs/ContactsApi.md#removecontactfromgroup)
1. Updates a contact [`updateContact`](docs/ContactsApi.md#updatecontact)

### DeliveryReportApi

1. Retrieves the delivery report for the Omnimessage [`retrieveDeliveryReport`](docs/DeliveryReportApi.md#retrievedeliveryreport)

### GroupsApi

1. Creates a new group with the provided name [`createGroup`](docs/GroupsApi.md#creategroup)
1. Deletes a group [`deleteGroup`](docs/GroupsApi.md#deletegroup)
1. Lists a group [`fetchGroup`](docs/GroupsApi.md#fetchgroup)
1. Returns all groups [`fetchGroups`](docs/GroupsApi.md#fetchgroups)
1. Updates a group with the provided name [`updateGroup`](docs/GroupsApi.md#updategroup)

### NumberLookupApi

1. Requests info about phone numbers [`fetchInfo`](docs/NumberLookupApi.md#fetchinfo)

### OmnimessageApi

1. Cancels a scheduled Omnimessage [`cancelScheduledMessage`](docs/OmnimessageApi.md#cancelscheduledmessage)
1. Sends an Omnimessage [`sendOmnimessage`](docs/OmnimessageApi.md#sendomnimessage)

### StatisticsApi

1. Requests statistics reports for each country [`createStatisticsReport`](docs/StatisticsApi.md#createstatisticsreport)

## Auth

**Type**: HTTP basic authentication

Read the [external getting-started article](https://messente.com/documentation/getting-started) which explains API keys and Sender ID logic.

## Getting started: sending an omnimessage

```java
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.api.*;
import com.messente.auth.HttpBasicAuth;

import java.util.Arrays;
import java.util.List;

// repositories { mavenCentral() }
// dependencies { implementation 'com.messente.api:messente-api' }

public class Main {
    public static void main(String[] args) {
        ApiClient apiClient = new ApiClient();
        OmnimessageApi apiInstance = new OmnimessageApi(apiClient);

        HttpBasicAuth basicAuth = (HttpBasicAuth) apiClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR_MESSENTE_API_USERNAME");
        basicAuth.setPassword("YOUR_MESSENTE_API_PASSWORD");

        Viber viber = new Viber();
        viber.text("hello viber");
        viber.sender("<sender name (optional)>");
        OmnimessageMessagesInner viberOmnimessageInner = new OmnimessageMessagesInner(viber);
        viberOmnimessageInner.setActualInstance(viber);

        SMS sms = new SMS();
        sms.text("hello sms");
        sms.sender("<sender name (optional)>");
        OmnimessageMessagesInner smsOmnimessageInner = new OmnimessageMessagesInner(sms);
        smsOmnimessageInner.setActualInstance(sms);

        WhatsAppParameter whatsAppParameter = new WhatsAppParameter();
        whatsAppParameter.type("text");
        whatsAppParameter.text("hello whatsapp");

        WhatsAppComponent whatsAppComponent = new WhatsAppComponent();
        whatsAppComponent.type("body");
        whatsAppComponent.setParameters(List.of(whatsAppParameter));

        WhatsAppTemplate whatsAppTemplate = new WhatsAppTemplate();
        whatsAppTemplate.name("<template_name>");
        whatsAppTemplate.language(new WhatsAppLanguage().code("<language_code>"));
        whatsAppTemplate.setComponents(List.of(whatsAppComponent));

        WhatsApp whatsApp = new WhatsApp();
        whatsApp.sender("<sender name (optional)>");
        whatsApp.template(whatsAppTemplate);

        OmnimessageMessagesInner whatsAppOmnimessageInner = new OmnimessageMessagesInner(whatsApp);
        whatsAppOmnimessageInner.setActualInstance(whatsApp);

        Omnimessage omnimessage = new Omnimessage();
        omnimessage.setMessages(
                Arrays.asList(
                        smsOmnimessageInner,
                        viberOmnimessageInner,
                        whatsAppOmnimessageInner
                )
        );
        omnimessage.setTo("<recipient_phone_number>");

        try {
            OmniMessageCreateSuccessResponse result = apiInstance.sendOmnimessage(omnimessage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling sendOmnimessage");
            System.err.println(e.getResponseBody());
        }
    }
}

```

## License

[Apache-2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

## Terms

[https://messente.com/terms-and-conditions](https://messente.com/terms-and-conditions)
