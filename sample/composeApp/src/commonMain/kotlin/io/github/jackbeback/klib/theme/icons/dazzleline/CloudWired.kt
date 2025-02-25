package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CloudWired: ImageVector
    get() {
        if (_CloudWired != null) {
            return _CloudWired!!
        }
        _CloudWired = ImageVector.Builder(
            name = "CloudWired",
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
                moveTo(15f, 18f)
                curveTo(15f, 19.657f, 13.657f, 21f, 12f, 21f)
                curveTo(10.343f, 21f, 9f, 19.657f, 9f, 18f)
                moveTo(15f, 18f)
                curveTo(15f, 16.343f, 13.657f, 15f, 12f, 15f)
                moveTo(15f, 18f)
                horizontalLineTo(21f)
                moveTo(9f, 18f)
                curveTo(9f, 16.343f, 10.343f, 15f, 12f, 15f)
                moveTo(9f, 18f)
                horizontalLineTo(3f)
                moveTo(12f, 15f)
                verticalLineTo(12f)
                moveTo(9.6f, 12f)
                curveTo(7.612f, 12f, 6f, 10.46f, 6f, 8.56f)
                curveTo(6f, 6.986f, 7.2f, 5.531f, 9f, 5.25f)
                curveTo(9.565f, 3.956f, 10.901f, 3f, 12.46f, 3f)
                curveTo(14.456f, 3f, 16.088f, 4.493f, 16.2f, 6.375f)
                curveTo(17.26f, 6.822f, 18f, 7.918f, 18f, 9.105f)
                curveTo(18f, 10.704f, 16.657f, 12f, 15f, 12f)
                lineTo(9.6f, 12f)
                close()
            }
        }.build()

        return _CloudWired!!
    }

@Suppress("ObjectPropertyName")
private var _CloudWired: ImageVector? = null
