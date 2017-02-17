/**
 * Created by Dmytro_Voropai on 17.02.2017.
 * 3 loops of OAuth2 authentication see picture "OAUTH2IMPLICIT" in package:
 * Loop 1:
 * Client sends password/username to "Security OAUTH2" in purpose to get access to Service. The
 * response tO him will be "Refresh token"(expires every 90 days). With this token he could create
 * another tokens.
 * Loop 2:
 * Then client send have just received token to "Security OAUTH2" again and as response will "Access
 * token"(lasts 10 seconds).
 * Loop 3:
 * And then client sends access token to service and receive access
 * Between "Security OAUTH2" and "Service" is mechanism of shearing access token.
 *
 */
package learn.java.OAuth2;