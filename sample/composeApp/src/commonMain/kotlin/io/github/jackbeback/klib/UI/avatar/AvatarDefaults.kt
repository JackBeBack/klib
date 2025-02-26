package io.github.jackbeback.klib.UI.avatar

import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * A class representing default configuration for user or team avatars.
 *
 * @param avatarSize Modifier to determine the size of the avatar's circle.
 * @param initialsFontStyle Font style for user initials (optional).
 * @param avatarPaddingEnd Padding at the end of the avatar circle (for proper alignment if needed).
 * @param onlineStateIconSize Modifier to define the size of the online state icon (optional).
 * @param avatarIconSize Size of the avatar's icon (optional).
 * @param nameFontStyle Font style for the name displayed next to or under the avatar (optional).
 */
class AvatarUIDefaults(
    var avatarSize: Modifier = Modifier,
    var initialsFontStyle: TextStyle = TextStyle(),
    var avatarPaddingEnd: Dp = 0.dp,
    var onlineStateIconModifier: Modifier = Modifier,
    var avatarIconSize: Dp = 0.dp,
    var nameFontStyle: TextStyle,
)

// Standard avatar sizes
val extraLargeAvatarSize = 60.dp
val largeAvatarSize = 42.dp
val mediumAvatarSize = 34.dp
val smallAvatarSize = 28.dp
val extraSmallAvatarSize = 24.dp

// Standard avatar icon sizes
val extraLargeAvatarIconSize = 27.dp
val largeAvatarIconSize = 27.dp
val mediumAvatarIconSize = 21.dp
val smallAvatarIconSize = 17.dp
val extraSmallAvatarIconSize = 15.dp

// Padding for user avatar alignment
val extraLargeAvatarPaddingEnd = 0.dp
val largeAvatarPaddingEnd = 0.dp
val mediumAvatarPaddingEnd = 2.dp
val smallAvatarPaddingEnd = 4.dp
val extraSmallAvatarPaddingEnd = 5.dp


/**
 * Predefined configurations for extra large user avatars.
 */
@Composable
fun extraLargeUserAvatarDefaults() = AvatarUIDefaults(
    avatarSize = Modifier.size(extraLargeAvatarSize),
    initialsFontStyle = MaterialTheme.typography.bodyLarge, // Define as per your app's typography
    avatarPaddingEnd = extraLargeAvatarPaddingEnd,
    onlineStateIconModifier = Modifier.largeIconSize(),
    avatarIconSize = extraLargeAvatarIconSize,
    nameFontStyle = MaterialTheme.typography.bodyLarge
)

/**
 * Predefined configurations for large user avatars.
 */
@Composable
fun largeUserAvatarDefaults() = AvatarUIDefaults(
    avatarSize = Modifier.size(largeAvatarSize),
    initialsFontStyle = MaterialTheme.typography.labelLarge,
    avatarPaddingEnd = largeAvatarPaddingEnd,
    onlineStateIconModifier = Modifier.largeIconSize(),
    avatarIconSize = largeAvatarIconSize,
    nameFontStyle = MaterialTheme.typography.labelLarge
)

/**
 * Predefined configurations for medium user avatars.
 */
@Composable
fun mediumUserAvatarDefaults() = AvatarUIDefaults(
    avatarSize = Modifier.size(mediumAvatarSize),
    initialsFontStyle = MaterialTheme.typography.labelMedium,
    avatarPaddingEnd = mediumAvatarPaddingEnd,
    onlineStateIconModifier = Modifier.mediumIconSize(),
    avatarIconSize = mediumAvatarIconSize,
    nameFontStyle = MaterialTheme.typography.labelMedium
)

/**
 * Predefined configurations for small user avatars.
 */
@Composable
fun smallUserAvatarDefaults() = AvatarUIDefaults(
    avatarSize = Modifier.size(smallAvatarSize),
    initialsFontStyle = MaterialTheme.typography.labelSmall,
    avatarPaddingEnd = smallAvatarPaddingEnd,
    onlineStateIconModifier = Modifier.smallIconSize(),
    avatarIconSize = smallAvatarIconSize,
    nameFontStyle = MaterialTheme.typography.labelSmall
)

/**
 * Predefined configurations for extra small user avatars.
 */
@Composable
fun extraSmallUserAvatarDefaults() = AvatarUIDefaults(
    avatarSize = Modifier.size(extraSmallAvatarSize),
    initialsFontStyle = MaterialTheme.typography.labelSmall.copy(fontSize = 11.sp),
    avatarPaddingEnd = extraSmallAvatarPaddingEnd,
    onlineStateIconModifier = Modifier.smallIconSize(),
    avatarIconSize = extraSmallAvatarIconSize,
    nameFontStyle = MaterialTheme.typography.labelSmall
)

/**
 * Predefined configurations for large team avatars.
 * - Initials and online state options are not needed.
 */
@Composable
fun largeTeamAvatarDefaults() = AvatarUIDefaults(
    avatarSize = Modifier.size(largeAvatarSize),
    avatarIconSize = largeAvatarIconSize,
    nameFontStyle = MaterialTheme.typography.labelLarge
)

/**
 * Predefined configurations for medium team avatars.
 */
@Composable
fun mediumTeamAvatarDefaults() = AvatarUIDefaults(
    avatarSize = Modifier.size(mediumAvatarSize),
    avatarIconSize = mediumAvatarIconSize,
    nameFontStyle = MaterialTheme.typography.labelMedium
)

/**
 * Predefined configurations for small team avatars.
 */
@Composable
fun smallTeamAvatarDefaults() = AvatarUIDefaults(
    avatarSize = Modifier.size(smallAvatarSize),
    avatarIconSize = smallAvatarIconSize,
    nameFontStyle = MaterialTheme.typography.labelSmall
)

/**
 * Predefined configurations for extra small team avatars.
 */
@Composable
fun extraSmallTeamAvatarDefaults() = AvatarUIDefaults(
    avatarSize = Modifier.size(extraSmallAvatarSize),
    onlineStateIconModifier = Modifier,
    avatarIconSize = extraSmallAvatarIconSize,
    nameFontStyle = MaterialTheme.typography.labelSmall
)

/**
 * Predefined configurations for a medium user avatar with a name displayed.
 */
@Composable
fun mediumUserAvatarWithNameDefaults() = AvatarUIDefaults(
    avatarSize = Modifier.size(mediumAvatarSize),
    initialsFontStyle = MaterialTheme.typography.labelSmall,
    nameFontStyle = MaterialTheme.typography.labelMedium
)

/**
 * Predefined configurations for a small user avatar with a name displayed.
 */
@Composable
fun smallUserAvatarWithNameDefaults() = AvatarUIDefaults(
    avatarSize = Modifier.size(smallAvatarSize),
    initialsFontStyle = MaterialTheme.typography.labelSmall,
    avatarIconSize = smallAvatarIconSize,
    nameFontStyle = MaterialTheme.typography.labelSmall
)

fun Modifier.largeIconSize() = this.then(size(24.dp))
fun Modifier.smallIconSize() = this.then(size(16.dp))
fun Modifier.mediumIconSize() = this.then(size(20.dp))