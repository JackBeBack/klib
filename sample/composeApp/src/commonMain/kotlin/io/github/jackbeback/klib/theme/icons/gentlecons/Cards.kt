package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Cards: ImageVector
    get() {
        if (_Cards != null) {
            return _Cards!!
        }
        _Cards = ImageVector.Builder(
            name = "Cards",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(9.4f, 7.533f)
                curveTo(9.2f, 7.267f, 8.8f, 7.267f, 8.6f, 7.533f)
                lineTo(6.225f, 10.7f)
                curveTo(6.092f, 10.878f, 6.092f, 11.122f, 6.225f, 11.3f)
                lineTo(8.6f, 14.467f)
                curveTo(8.8f, 14.733f, 9.2f, 14.733f, 9.4f, 14.467f)
                lineTo(11.775f, 11.3f)
                curveTo(11.908f, 11.122f, 11.908f, 10.878f, 11.775f, 10.7f)
                lineTo(9.4f, 7.533f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(4.092f, 5.639f)
                curveTo(4.036f, 5.555f, 4.036f, 5.445f, 4.092f, 5.361f)
                lineTo(4.792f, 4.312f)
                curveTo(4.891f, 4.164f, 5.109f, 4.164f, 5.208f, 4.312f)
                lineTo(5.908f, 5.361f)
                curveTo(5.964f, 5.445f, 5.964f, 5.555f, 5.908f, 5.639f)
                lineTo(5.208f, 6.688f)
                curveTo(5.109f, 6.836f, 4.891f, 6.836f, 4.792f, 6.688f)
                lineTo(4.092f, 5.639f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(13.208f, 15.312f)
                curveTo(13.109f, 15.164f, 12.891f, 15.164f, 12.792f, 15.312f)
                lineTo(12.092f, 16.361f)
                curveTo(12.036f, 16.445f, 12.036f, 16.555f, 12.092f, 16.639f)
                lineTo(12.792f, 17.688f)
                curveTo(12.891f, 17.836f, 13.109f, 17.836f, 13.208f, 17.688f)
                lineTo(13.908f, 16.639f)
                curveTo(13.964f, 16.555f, 13.964f, 16.445f, 13.908f, 16.361f)
                lineTo(13.208f, 15.312f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 4f)
                curveTo(1f, 2.343f, 2.343f, 1f, 4f, 1f)
                horizontalLineTo(14f)
                curveTo(15.132f, 1f, 16.118f, 1.627f, 16.629f, 2.553f)
                lineTo(20.839f, 3.681f)
                curveTo(22.439f, 4.11f, 23.389f, 5.755f, 22.96f, 7.356f)
                lineTo(19.337f, 20.879f)
                curveTo(18.908f, 22.479f, 17.263f, 23.429f, 15.663f, 23f)
                lineTo(8.198f, 21f)
                horizontalLineTo(4f)
                curveTo(2.343f, 21f, 1f, 19.657f, 1f, 18f)
                verticalLineTo(4f)
                close()
                moveTo(17f, 18f)
                verticalLineTo(4.723f)
                lineTo(20.321f, 5.613f)
                curveTo(20.855f, 5.756f, 21.171f, 6.305f, 21.028f, 6.838f)
                lineTo(17.405f, 20.361f)
                curveTo(17.262f, 20.895f, 16.714f, 21.211f, 16.18f, 21.068f)
                lineTo(15.12f, 20.784f)
                curveTo(16.222f, 20.34f, 17f, 19.261f, 17f, 18f)
                close()
                moveTo(4f, 3f)
                curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
                verticalLineTo(18f)
                curveTo(3f, 18.552f, 3.448f, 19f, 4f, 19f)
                horizontalLineTo(14f)
                curveTo(14.552f, 19f, 15f, 18.552f, 15f, 18f)
                verticalLineTo(4f)
                curveTo(15f, 3.448f, 14.552f, 3f, 14f, 3f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _Cards!!
    }

@Suppress("ObjectPropertyName")
private var _Cards: ImageVector? = null
