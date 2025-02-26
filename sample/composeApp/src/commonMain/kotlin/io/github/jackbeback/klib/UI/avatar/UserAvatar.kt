package io.github.jackbeback.klib.UI.avatar

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import io.github.jackbeback.klib.theme.icons.dazzleline.DazzleLine


/**
 * A composable to show the online status of a user or team, represented by a small circle with an icon.
 *
 * @param modifier Modifier for customization
 * @param backgroundColor Background color of the icon
 * @param borderColor Border color around the circle
 * @param icon Icon displayed inside the circle
 * @param iconColor Color of the icon
 */
@Composable
fun OnlineStatusIcon(
    modifier: Modifier,
    backgroundColor: Color = MaterialTheme.colorScheme.primaryContainer,
    borderColor: Color = MaterialTheme.colorScheme.onPrimaryContainer,
    icon: ImageVector = Icons.Default.Person,
    iconColor: Color = MaterialTheme.colorScheme.onPrimaryContainer
) {
    Box(
        modifier = modifier
            .border(0.75f.dp, SolidColor(borderColor), CircleShape)
            .padding(0.5f.dp)
            .clip(CircleShape)
            .background(backgroundColor),
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = Modifier.fillMaxSize(0.5f),
            imageVector = icon,
            contentDescription = null,
            colorFilter = ColorFilter.tint(iconColor)
        )
    }
}

/**
 * A composable to represent a user's avatar with initials or a fallback icon.
 * Optionally displays an online status indicator.
 *
 * @param modifier Modifier for customization
 * @param avatarDefaults Default configuration for the avatar (size, padding, text style)
 * @param initials User initials to display in the center of the avatar
 * @param isOwnUser Indicates if the avatar belongs to the currently logged-in user
 * @param showOnlineState True to display the online status icon in the bottom-right corner
 * @param avatarBackgroundColor Customizable background color for the avatar
 */
@Composable
fun UserAvatar(
    modifier: Modifier = Modifier,
    avatarDefaults: AvatarUIDefaults = mediumUserAvatarWithNameDefaults(),
    initials: String,
    isOwnUser: Boolean = true,
    showOnlineState: Boolean = false,
    avatarBackgroundColor: Color? = null
) {
    val backgroundColor = avatarBackgroundColor ?: if (isOwnUser) MaterialTheme.colorScheme.primaryContainer else MaterialTheme.colorScheme.surface
    val textColor = MaterialTheme.colorScheme.onBackground

    Box(modifier = modifier) {
        Box(
            modifier = Modifier.padding(end = avatarDefaults.avatarPaddingEnd)
        ) {
            Box(
                modifier = Modifier
                    .then(avatarDefaults.avatarSize)
                    .clip(CircleShape)
                    .background(backgroundColor),
                contentAlignment = Alignment.Center
            ) {
                if (initials.isNotEmpty()) {
                    Text(
                        text = initials,
                        color = textColor,
                        maxLines = 1,
                        style = avatarDefaults.initialsFontStyle
                    )
                } else {
                    Image(
                        modifier = Modifier.size(avatarDefaults.avatarIconSize),
                        imageVector = Icons.Default.Person,
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(Color.Gray)
                    )
                }
            }
        }

        if (showOnlineState) {
            OnlineStatusIcon(
                modifier = Modifier
                    .then(avatarDefaults.onlineStateIconModifier)
                    .align(Alignment.BottomEnd)
            )
        }
    }
}

/**
 * A composable to display a User Avatar alongside a name.
 * Can be used in dropdowns or lists where names are needed.
 *
 * @param modifier Modifier for customization
 * @param avatarDefaults Default configuration for the avatar (size, text style)
 * @param isOwnUser Indicates if the avatar belongs to the currently logged-in user
 * @param name The name of the user
 * @param initials User initials to display in the avatar
 */
@Composable
fun UserAvatarWithName(
    modifier: Modifier = Modifier,
    avatarDefaults: AvatarUIDefaults = mediumUserAvatarWithNameDefaults(),
    isOwnUser: Boolean,
    name: String,
    initials: String
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        UserAvatar(
            modifier = Modifier,
            initials = initials,
            avatarDefaults = avatarDefaults,
            isOwnUser = isOwnUser
        )

        Text(
            modifier = Modifier.padding(start = 8.dp),
            text = name,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            color = Color.DarkGray,
            style = avatarDefaults.nameFontStyle
        )
    }
}

/**
 * A composable to represent a team avatar, with an optional icon.
 *
 * @param modifier Modifier for customization
 * @param avatarDefaults Default configuration for the team avatar
 * @param icon The icon displayed inside the avatar
 * @param iconColor Color of the icon
 * @param iconBackgroundColor Background color of the avatar
 */
@Composable
fun TeamAvatar(
    modifier: Modifier = Modifier,
    avatarDefaults: AvatarUIDefaults = mediumUserAvatarDefaults(),
    icon: ImageVector = Icons.Default.Person,
    iconColor: Color = MaterialTheme.colorScheme.onPrimaryContainer,
    iconBackgroundColor: Color = MaterialTheme.colorScheme.primaryContainer
) {
    Box(
        modifier = Modifier
            .then(avatarDefaults.avatarSize)
            .clip(CircleShape)
            .background(iconBackgroundColor),
        contentAlignment = Alignment.Center
    ) {

            Image(
                modifier = Modifier.size(avatarDefaults.avatarIconSize),
                imageVector = icon,
                contentDescription = null,
                colorFilter = iconColor.let { ColorFilter.tint(it) }
            )

    }
}

@Composable
fun AvatarSample(){
    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
        TeamAvatar()
        UserAvatarWithName(Modifier.padding(start = 8.dp), isOwnUser = false, name = "Jack", initials = "JD")
        UserAvatarWithName(Modifier.padding(start = 8.dp), isOwnUser = true, name = "Fine", initials = "JD")
        UserAvatar(initials = "JK")
    }
}