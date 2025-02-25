package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MailHeart: ImageVector
    get() {
        if (_MailHeart != null) {
            return _MailHeart!!
        }
        _MailHeart = ImageVector.Builder(
            name = "MailHeart",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 19f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 19f, 4.52f, 19f, 4.092f, 18.782f)
                curveTo(3.716f, 18.59f, 3.41f, 18.284f, 3.218f, 17.908f)
                curveTo(3f, 17.48f, 3f, 16.92f, 3f, 15.8f)
                verticalLineTo(8.2f)
                curveTo(3f, 7.08f, 3f, 6.52f, 3.218f, 6.092f)
                curveTo(3.41f, 5.716f, 3.716f, 5.41f, 4.092f, 5.218f)
                curveTo(4.52f, 5f, 5.08f, 5f, 6.2f, 5f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 5f, 19.48f, 5f, 19.908f, 5.218f)
                curveTo(20.284f, 5.41f, 20.59f, 5.716f, 20.782f, 6.092f)
                curveTo(21f, 6.52f, 21f, 7.08f, 21f, 8.2f)
                verticalLineTo(11f)
                moveTo(20.607f, 8.262f)
                lineTo(15.55f, 11.634f)
                curveTo(14.267f, 12.489f, 13.625f, 12.917f, 12.932f, 13.083f)
                curveTo(12.319f, 13.229f, 11.68f, 13.229f, 11.068f, 13.083f)
                curveTo(10.374f, 12.917f, 9.733f, 12.489f, 8.45f, 11.634f)
                lineTo(3.147f, 8.099f)
                moveTo(18.498f, 15.712f)
                curveTo(17.798f, 14.933f, 16.631f, 14.723f, 15.754f, 15.437f)
                curveTo(14.877f, 16.15f, 14.754f, 17.343f, 15.443f, 18.187f)
                curveTo(16.131f, 19.031f, 18.498f, 21f, 18.498f, 21f)
                curveTo(18.498f, 21f, 20.864f, 19.031f, 21.553f, 18.187f)
                curveTo(22.241f, 17.343f, 22.133f, 16.143f, 21.241f, 15.437f)
                curveTo(20.349f, 14.731f, 19.197f, 14.933f, 18.498f, 15.712f)
                close()
            }
        }.build()

        return _MailHeart!!
    }

@Suppress("ObjectPropertyName")
private var _MailHeart: ImageVector? = null
